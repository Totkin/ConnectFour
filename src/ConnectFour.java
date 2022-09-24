import java.util.ArrayList;
import java.util.List;

public class ConnectFour {
    Board board = new Board();
    //Player[] players = {new Player(1), new Player(2)};
    List<Player> players = new ArrayList<>();
    String[] colores = {"Red", "Yellow"};

    public ConnectFour() {
        for (String color : colores) {
            this.players.add(new Player(color));
        }
    }

    private void play() {
        int turn = 0;

        System.out.println("Game start");
        do {
            board.paint();
            players.get(turn).addToken(board);
            if (!board.hasFourConnected()) {
                turn = (++turn) % 2;
            }
        } while (!board.hasFourConnected());
        board.paint();
        // System.out.println("Game finished: player" + players[turn].getColor() + " winns");
        players.get(turn).winner();
    }

    public static void main(String[] args) {
        new ConnectFour().play();
    }
}
