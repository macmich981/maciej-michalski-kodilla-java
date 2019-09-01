package com.kodilla.rps;

public class GameRunner {
    private UserInterface userInterface;
    private String userName;
    private int maxNumberOfRounds;

    public GameRunner(UserInterface userInterface) {
        this.userInterface = userInterface;
        this.userName = userInterface.initName();
        this.maxNumberOfRounds = userInterface.initMaxRounds();
    }

    public boolean run() {
        Game game = new Game(userInterface, userName, maxNumberOfRounds);
        GameResult gameResult = game.start();

        while (true) {
            if (gameResult == GameResult.NEXT) {
                if (!userInterface.confirmNext()) {
                    gameResult = game.start();
                } else {
                    return false;
                }
            } else if (gameResult == GameResult.END) {
                if (userInterface.confirmEnd()) {
                    return true;
                } else {
                    if (game.getMaxNumberOfRounds() == game.getPlayer().getPoints() ||
                    game.getMaxNumberOfRounds() == game.getComputerPlayer().getPoints()) {
                        return false;
                    }
                    gameResult = game.start();
                }
            }
        }
    }
}
