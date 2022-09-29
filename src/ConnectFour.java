import models.*;
import types.Color;
import views.View;

public class ConnectFour {
    private final int NUMBER_PLAYERS = 2;
    private final Board board;
    private final Player[] players;
    private final Turn turn;
    private final View view;

    public ConnectFour() {
        view = new View();
        board = new Board();
        players = new Player[NUMBER_PLAYERS];
        turn = new Turn();
        createPlayers(view.gameInit());
    }

    private void createPlayers(int numberUserPlayers) {
        for (int i = 0; i < NUMBER_PLAYERS; i++) {
            if (i < numberUserPlayers) {
                players[i] = new UserPlayer(Color.values()[i]);
            } else {
                players[i] = new MachinePlayer(Color.values()[i]);
            }
        }
    }

    private void play() {
        do {
            view.writeBoard(board);
            players[turn.takeTurn()].addToken(board);
        } while (!board.hasFourConnected());
        view.writeBoard(board);
        view.writeWinner(players[turn.thisTurn()]);
    }

    public static void main(String[] args) {
        new ConnectFour().play();
    }
}

