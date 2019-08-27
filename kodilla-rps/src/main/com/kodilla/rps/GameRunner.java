package src.main.com.kodilla.rps;

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

        while (true) {
            GameResult gameResult = game.start();
            if (gameResult == GameResult.NEXT) {
                if (!userInterface.confirmNext()) {
                    continue;
                } else {
                    return false;
                }
            } else if (gameResult == GameResult.END) {
                if (userInterface.confirmEnd()) {
                    return true;
                } else {
                    break;
                }
            }
        }
        return false;
    }
}
