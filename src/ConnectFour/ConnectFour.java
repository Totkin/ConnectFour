package ConnectFour;

import java.util.Scanner;

public class ConnectFour {
    public static void playConnectFour() {
/*		System.out.println("Game start");
		do {
			System.out.println(board.paint());
			turn.changePlayerTurn();
			player.insertToken();
		}while(!board.hasFourConnected());
		board.paint();
		System.out.println("Game finnished: player x winns");*/
        Board board = new Board();
        Player[] players = {new Player(1), new Player(2)};
        Scanner entrada = new Scanner(System.in);
        int turn = 1;

        System.out.println("Game start");
        do {
            System.out.println(board.paint());
            System.out.println("Player turn " + players[turn - 1].getColor());
            System.out.println("Type the column where you want to insert the token:");
            board.addToken(Integer.parseInt(entrada.nextLine()), players[turn - 1].getColor());
            turn = changeTurn(turn);
        } while (!board.hasFourConnected());
        System.out.println(board.paint());
        System.out.println("Game finished: player" + players[turn - 2].getColor() + " winns");
    }

    private static int changeTurn(int turn) {
        turn++;
        if (turn > 2) {
            turn = 1;
        }
        return turn;
    }

}
