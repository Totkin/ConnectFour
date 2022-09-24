import java.util.Scanner;

public class Player {
    private char color;

    public Player(String color) {
        this.color = color.charAt(0);
    }

    public void addToken(Board board){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Player" + this.color + " turn");
        System.out.println("Type the column where you want to insert the token:");
        board.addToken(Integer.parseInt(entrada.nextLine()), this.color);
    }

    public void winner() {
        System.out.println("Game finished: player" + this.color + " winns");
    }
}
