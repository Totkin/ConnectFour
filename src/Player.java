import java.util.Objects;
import java.util.Scanner;

public class Player {
    private final Color color;
    private final String type;
    private final Scanner input = new Scanner(System.in);

    public Player(Color color, String type) {
        this.color = color;
        this.type = type;
    }

    public void addToken(Board board) {
        boolean added;
        System.out.println("Player " + this.color + " turn");
        if (Objects.equals(type, "human")) {
            do {
                added = board.addToken(inputNumber() - 1, this.color);
            } while (!added);
        }
        if (Objects.equals(type, "machine")) {
            System.out.println("The machine has chosen the column:");
            do {
                added = board.addToken((int) (Math.random() * 7), this.color);
            } while (!added);
        }
    }

    public void winnerDisplay() {
        System.out.println("Game finished: the player " + this.color + " has won");
    }

    private int inputNumber() {
        int inputNumber;
        do {
            System.out.println("Type the column where you want to insert the token from 1 to 7:");
            while (!input.hasNextInt()) input.next();
            inputNumber = input.nextInt();
        } while (!(0 < inputNumber && inputNumber < 8));
        return inputNumber;
    }
}
