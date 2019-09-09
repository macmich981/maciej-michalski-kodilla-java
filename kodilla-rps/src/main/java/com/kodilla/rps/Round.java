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
            userInterface.displayMove(computerPlayer.getComputerName(), computerPlayerMove);
            int result = new RoundResolver().resolve(playerMove, computerPlayerMove);
            switch (result) {
                case Result.DRAW:
                    break;
                case Result.PLAYER_WIN:
                    player.addPoint();
                    break;
                case Result.COMPUTER_WIN:
                    computerPlayer.addPoint();
                    break;
            }
            return result;
        }
    }
}
