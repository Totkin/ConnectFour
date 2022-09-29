package views;

import models.Board;
import types.Coordinate;

public class BoardView {
    public void write(Board board) {
        String row;
        Coordinate[][] squares = board.getAllSquares();
        for (Coordinate[] square : squares) {
            row = "";
            for (int j = 0; j < squares[0].length; j++) {
                row += square[j].getColor().getCode() + " ";
            }
            System.out.println(row);
        }
    }
}
