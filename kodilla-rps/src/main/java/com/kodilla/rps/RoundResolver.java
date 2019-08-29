package com.kodilla.rps;

public class RoundResolver {
    public int resolve(int playerMove, int computerPlayerMove) {
        if (playerMove == computerPlayerMove) {
            return 0;
        }

        switch (playerMove) {
            case Move.ROCK:
                return (computerPlayerMove == Move.SCISSORS ? Result.PLAYER_WIN : Result.COMPUTER_WIN);

            case Move.PAPER:
                return (computerPlayerMove == Move.ROCK ? Result.PLAYER_WIN : Result.COMPUTER_WIN);

            case Move.SCISSORS:
                return (computerPlayerMove == Move.PAPER ? Result.PLAYER_WIN : Result.COMPUTER_WIN);
        }
        return 0;
    }
}
