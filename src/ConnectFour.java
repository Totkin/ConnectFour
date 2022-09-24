public class ConnectFour {
    Board board = new Board();
    Player[] players = {new Player(1), new Player(2)};
    private void play() {
        int turn = 0;

        System.out.println("Game start");
        do {

            //turn = changeTurn(turn);
            turn = (++turn) % 2;
            System.out.println(board.paint());

          /*  System.out.println("Player" + players[turn - 1].getColor() + " turn");
            System.out.println("Type the column where you want to insert the token:");
            board.addToken(Integer.parseInt(entrada.nextLine()), players[turn - 1].getColor());
           */
            players[turn].getUserPosition(board);

        } while (!board.hasFourConnected());
        System.out.println(board.paint());
        System.out.println("Game finished: player" + players[turn].getColor() + " winns");
    }
/*
    private int changeTurn(int turn) {
        turn++;
        if (turn > 2) {
            turn = 1;
        }
        return turn;
    }
*/
    public static void main(String[] args) {
        new ConnectFour().play();
    }
}
