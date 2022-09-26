import java.util.Scanner;

public class Player {
    private final Color color;

    public Player(Color color) {
        this.color = color;
    }

    public void addToken(Board board) {
        Scanner input = new Scanner(System.in);
        System.out.println("Player " + this.color + " turn");
        System.out.println("Type the column where you want to insert the token:");
        board.addToken(Integer.parseInt(input.nextLine()) - 1, this.color);
    }

    public void winnerDisplay() {
        System.out.println("Game finished: the player " + this.color + " has won");
    }
}
