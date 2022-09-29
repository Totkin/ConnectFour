package views;

import java.util.Scanner;

public class GameView {
    Scanner input = new Scanner(System.in);

    public int gameInit() {
        System.out.println("Game start");
        int numberPlayers;
        do {
            System.out.println("How many players play 0, 1 or 2?");
            numberPlayers = input.nextInt();
        } while (!(0 <= numberPlayers && numberPlayers < 3));

        return numberPlayers;
    }
}