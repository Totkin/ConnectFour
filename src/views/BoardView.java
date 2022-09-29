package views;

import models.Board;
import types.Coordinate;

public class BoardView {
    public void write(Board board) {
        String row;
        Coordinate[][] squares= board.getAllSquares();
        for (int i = 0; i < squares.length; i++) {
            row = "";
            for (int j = 0; j < squares[0].length; j++) {
                row += squares[i][j].getColor().getCode() + " ";
            }
            System.out.println(row);
        }
    }
}
