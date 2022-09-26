import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Player {
    private final Color color;
    private final String type;
    private final Scanner input = new Scanner(System.in);
    private final Random random = new Random();

    public Player(Color color, String type) {
        this.color = color;
        this.type = type;
    }

    public void addToken(Board board) {
        boolean added;
        System.out.println("Player " + this.color + " turn");
        if (Objects.equals(type, "human")) {
            System.out.println("Type the column where you want to insert the token:");
            do {
                added = board.addToken(Integer.parseInt(input.nextLine()) - 1, this.color);
            } while (!added);
        }
        if (Objects.equals(type, "machine")) {
            System.out.println("The machine has chosen the column:");
            do {
                added= board.addToken(random.nextInt(6 - 1 + 1) + 1, this.color);
            } while (!added);
        }
    }

    public void winnerDisplay() {
        System.out.println("Game finished: the player " + this.color + " has won");
    }
}
