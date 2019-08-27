package com.kodilla.rps;

public class Round {
    private UserInterface userInterface;

    public Round(UserInterface userInterface) {
        this.userInterface = userInterface;
    }

    public int roundResult(Player player, ComputerPlayer computerPlayer) {
        int playerMove = player.getMove();
        userInterface.displayMove(player.getName(), playerMove);
        if (playerMove == Move.END_OF_GAME) {
            return Move.END_OF_GAME;
        } else if (playerMove == Move.NEW_GAME) {
            return Move.NEW_GAME;
        } else {
            int computerPlayerMove = computerPlayer.getMove();
            userInterface.displayMove("Komputer", computerPlayerMove);
            int result = new RoundResolver().resolve(playerMove, computerPlayerMove);
            switch (result) {
                case 0: //Remis
                    break;
                case 1: //Gracz wygrywa
                    player.addPoint();
                    break;
                case -1: //Komputer wygrywa
                    computerPlayer.addPoint();
                    break;
            }
            return result;
        }
    }
}
