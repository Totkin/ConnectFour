public class ConnectFour {
    private final int NUMBER_PLAYERS = 2;
    private final Board board = new Board();
    private final Player[] players = new Player[NUMBER_PLAYERS];
    private final Turn turn=new Turn();

    public ConnectFour() {
        for (int i = 0; i < NUMBER_PLAYERS; i++) {
            players[i] = new Player(Color.values()[i]);
        }
    }

    private void play() {
        System.out.println("Game start");
        do {
            board.paint();
            players[turn.takeTurn()].addToken(board);
        } while (!board.hasFourConnected());
        board.paint();
        players[turn.thisTurn()].winnerDisplay();
    }

    public static void main(String[] args) {
        new ConnectFour().play();
    }
}

