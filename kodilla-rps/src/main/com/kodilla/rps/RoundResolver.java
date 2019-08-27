package src.main.com.kodilla.rps;

public class RoundResolver {
    public int resolve(int playerMove, int computerPlayerMove) {
        if (playerMove == computerPlayerMove) {
            return 0;
        }

        switch (playerMove) {
            case Move.ROCK:
                return (computerPlayerMove == Move.SCISSORS ? 1 : -1);

            case Move.PAPER:
                return (computerPlayerMove == Move.ROCK ? 1 : -1);

            case Move.SCISSORS:
                return (computerPlayerMove == Move.PAPER ? 1 : -1);
        }
        return 0;
    }
}
