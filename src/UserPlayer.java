import java.util.Scanner;

public class UserPlayer extends Player {
    private final Scanner input = new Scanner(System.in);

    public UserPlayer(Color color) {
        super(color);
    }

    @Override
    public void addToken(Board board) {
        boolean added;
        System.out.println("Player " + super.color + " turn");
        do {
            added = board.addToken(inputNumber() - 1, super.color);
        } while (!added);
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
