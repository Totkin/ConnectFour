import java.util.Scanner;

public class Player {
    private int color;

    public Player(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void getUserPosition(Board board){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Player" + this.color + " turn");
        System.out.println("Type the column where you want to insert the token:");
        board.addToken(Integer.parseInt(entrada.nextLine()), this.color);
    }
}
