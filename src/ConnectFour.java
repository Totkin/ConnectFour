public class ConnectFour {
    Board board = new Board();
    Player[] players = {new Player(1), new Player(2)};
    private void play() {
        int turn = 0;

        System.out.println("Game start");
        do {
            board.paint();
            players[turn].addToken(board);
            if(!board.hasFourConnected()) {
                turn = (++turn) % 2;
            }
        } while (!board.hasFourConnected());
        board.paint();
        System.out.println("Game finished: player" + players[turn].getColor() + " winns");
    }

    public static void main(String[] args) {
        new ConnectFour().play();
    }
}
