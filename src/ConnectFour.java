import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConnectFour {
    private final Board board = new Board();
    private final List<Player> players = new ArrayList<>();
    private final Turn turn = new Turn();

    public ConnectFour() {
        gamePreparation();
    }

    private void gamePreparation() {
        Scanner input = new Scanner(System.in);
        int numberPlayers;
        do {
            System.out.println("How many players play 0, 1 or 2?");
            numberPlayers = input.nextInt();
        } while (!(0 <= numberPlayers && numberPlayers < 3));

        if (numberPlayers == 0) {
            createPlayers(2, "machine");
        }
        if (numberPlayers == 1) {
            createPlayers(1, "human");
            createPlayers(1, "machine");
        }
        if (numberPlayers == 2) {
            createPlayers(2, "human");
        }
    }

    private void createPlayers(int numberPlayers, String type) {
        for (int i = 0; i < numberPlayers; i++) {
            players.add(new Player(Color.values()[players.size()], type));
        }
    }

    private void play() {
        System.out.println("Game start");
        do {
            board.paint();
            players.get(turn.takeTurn()).addToken(board);
        } while (!board.hasFourConnected());
        board.paint();
        players.get(turn.thisTurn()).winnerDisplay();
    }

    public static void main(String[] args) {
        new ConnectFour().play();
    }
}

