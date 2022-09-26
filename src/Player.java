
public abstract class Player {
    protected final Color color;

    public Player(Color color) {
        this.color = color;
    }

    public abstract void addToken(Board board);

    public void winnerDisplay() {
        System.out.println("Game finished: the player " + this.color + " has won");
    }
}
