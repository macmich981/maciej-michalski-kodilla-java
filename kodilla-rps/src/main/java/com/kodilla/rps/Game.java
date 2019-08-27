package com.kodilla.rps;

public class Game {
    private UserInterface userInterface;
    private Player player;
    private ComputerPlayer computerPlayer;
    private int maxNumberOfRounds;

    public Game(UserInterface userInterface, String userName, int maxNumberOfRounds) {
        this.userInterface = userInterface;
        this.player = new Player(userName);
        this.computerPlayer = new ComputerPlayer();
        this.maxNumberOfRounds = maxNumberOfRounds;
    }

    public GameResult start() {
        while (player.getPoints() < maxNumberOfRounds && computerPlayer.getPoints() < maxNumberOfRounds) {
            userInterface.printMenu();
            int roundResult = new Round(userInterface).roundResult(player, computerPlayer);
            if (roundResult == Move.END_OF_GAME) {
                break;
            } else if (roundResult == Move.NEW_GAME) {
                return GameResult.NEXT;
            }
            userInterface.informRound(roundResult, player, computerPlayer);
        }
        userInterface.summaryOfGame(player, computerPlayer);
        return GameResult.END;
    }
}
