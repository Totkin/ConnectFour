package ConnectFour;

public class ConnectFour {
    public Player playerRed;
    public Player playerYellow;

    public Board board = new Board();

    public ConnectFour() {
        this.playerRed = new Player("Red");
        this.playerYellow = new Player("Yellow");
    }

    public boolean jugar() {
        board.paintBoard();
        return true;
    }
}
