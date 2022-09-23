import java.util.Scanner;

public class ConnectFour {
    private  void playConnectFour() {
        Board board = new Board();
        Player[] players = {new Player(1), new Player(2)};
        int turn = 0;

        System.out.println("Game start");
        do {
            turn = changeTurn(turn);
            System.out.println(board.paint());

            players[turn-1].getUserPosition(turn-1,board);

          /*  System.out.println("Player" + players[turn - 1].getColor() + " turn");
            System.out.println("Type the column where you want to insert the token:");
            board.addToken(Integer.parseInt(entrada.nextLine()), players[turn - 1].getColor());
           */
        } while (!board.hasFourConnected());
        System.out.println(board.paint());
        System.out.println("Game finished: player" + players[turn - 1].getColor() + " winns");
    }

    private  int changeTurn(int turn) {
        turn++;
        if (turn > 2) {
            turn = 1;
        }
        return turn;
    }
    public static void main(String[] args) {
        new ConnectFour().playConnectFour();
    }
}
