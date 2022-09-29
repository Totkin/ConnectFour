package views;

import models.MachinePlayer;
import models.Player;
import models.UserPlayer;

import java.util.Scanner;

public class PlayerView {
    private final Scanner input = new Scanner(System.in);
    public void writeWinner(Player player) {
        System.out.println("Game finished: the player " + player.getColor() + " has won");
    }
    public int writeTurn(UserPlayer player){
        System.out.println("Player " + player.getColor() + " turn");
        int column = 0;
        boolean isInt = false;
        do {
            System.out.println("Type the column where you want to insert the token from 1 to 7:");
            if (input.hasNextInt()) {
                column = input.nextInt() - 1;
                isInt = true;
            } else {
                input.next();
            }
        } while (!isInt || !(column >= 0 && column <= 7));
        return column;
    }
    public void writeTurn(MachinePlayer machine){
        System.out.println("Machine " + machine.getColor() + " turn");
        System.out.println("The machine has chosen the column:");
    }
}
