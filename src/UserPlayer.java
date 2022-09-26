import java.util.Scanner;

public class UserPlayer extends Player{
    private final Scanner input = new Scanner(System.in);
    public UserPlayer(Color color) {
        super(color);
    }

    @Override
    public void addToken(Board board) {
        boolean added;
        System.out.println("Player " + super.color + " turn");
        System.out.println("Type the column where you want to insert the token:");
        do {
            added = board.addToken(Integer.parseInt(input.nextLine()) - 1, super.color);
        } while (!added);
    }
}
