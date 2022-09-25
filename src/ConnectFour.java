import java.util.ArrayList;
import java.util.List;

public class ConnectFour {
    Board board = new Board();
    //Player[] players = {new Player(1), new Player(2)};
    //List<Player> players = new ArrayList<>();
    Player[] players= new Player[Color.values().length];
    //String[] colores = {"Red", "Yellow"};

    public ConnectFour() {
        /*for (String color : colores) {
            this.players.add(new Player(color));
        }*/
        for(int i=0; i< players.length; i++){
            players[i]= new Player(Color.values()[i]);
        }
    }

    private void play() {
        int turn = 0;

        System.out.println("Game start");
        do {
            board.paint();
            players[turn].addToken(board);
            if (!board.hasFourConnected()) {
                turn = (++turn) % 2;
            }
        } while (!board.hasFourConnected());
        board.paint();
        players[turn].winnerDisplay();
    }

    public static void main(String[] args) {
        new ConnectFour().play();
    }
}

