public class Board {

    private final int ROWS = 6;
    private final int COLUMNS = 7;
    private char[][] squares = new char[ROWS][COLUMNS];

    public Board() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                squares[i][j] = 0;
            }
        }
    }

    public void paint() {
        String row;
        String graphicBoard = "";
        for (int i = 0; i < ROWS; i++) {
            row = "";
            for (int j = 0; j < COLUMNS; j++) {
                row += squares[i][j] + " ";
            }
            graphicBoard += row + "\n";
        }
        System.out.println(graphicBoard);
    }

    public boolean addToken(int column, Color color) {
        boolean added = false;
        if (column > 0 && column <= COLUMNS) {
            for (int i = ROWS - 1; i >= 0; i--) {
                if (squares[i][column - 1] == 0) {
                    squares[i][column - 1] = color.getGraphicRepresentation();
                    added = true;
                    break;
                }
            }
        }
        return added;
    }

    public boolean hasFourConnected() {
        int color;
        boolean hasFour = false;
        mainLoop:
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                color = squares[i][j];
                if (color != 0) {
                    if (hasFour = hasFourDown(color, i, j)) {
                        break mainLoop;
                    }
                    if (hasFour = hasFourRight(color, i, j)) {
                        break mainLoop;
                    }
                    if (hasFour = hasFourDownRight(color, i, j)) {
                        break mainLoop;
                    }
                    if (hasFour = hasFourDownLeft(color, i, j)) {
                        break mainLoop;
                    }
                }
            }
        }
        return hasFour;
    }

    //checks if given a square, it has 3 more tokens under it with the same color
    private boolean hasFourDown(int color, int i, int j) {
        int counter = 1;
        boolean hasFour = false;
        if (ROWS - i >= 4) {
            while (i + 1 < ROWS && color == squares[i + 1][j]) {
                i++;
                counter++;
                if (counter == 4) {
                    hasFour = true;
                    break;
                }
            }
        }
        return hasFour;
    }

    //checks if given a square, it has 3 more tokens right it with the same color
    private boolean hasFourRight(int color, int i, int j) {
        int counter = 1;
        boolean hasFour = false;
        if (COLUMNS - j >= 4) {
            while (j + 1 < COLUMNS && color == squares[i][j + 1]) {
                j++;
                counter++;
                if (counter == 4) {
                    hasFour = true;
                    break;
                }
            }
        }
        return hasFour;
    }

    //checks if given a square, it has 3 more tokens in the down right diagonal with the same color
    private boolean hasFourDownRight(int color, int i, int j) {
        int counter = 1;
        boolean hasFour = false;
        if (ROWS - i >= 4 && COLUMNS - j >= 4) {
            while (i + 1 < ROWS && j + 1 < COLUMNS && color == squares[i + 1][j + 1]) {
                i++;
                j++;
                counter++;
                if (counter == 4) {
                    hasFour = true;
                    break;
                }
            }
        }
        return hasFour;
    }

    //checks if given a square, it has 3 more tokens in the down left diagonal with the same color
    private boolean hasFourDownLeft(int color, int i, int j) {
        int counter = 1;
        boolean hasFour = false;
        if (ROWS - i >= 4 && j + 1 >= 4) {
            while (i + 1 < ROWS && j - 1 >= 0 && color == squares[i + 1][j - 1]) {
                i++;
                j--;
                counter++;
                if (counter == 4) {
                    hasFour = true;
                    break;
                }
            }
        }
        return hasFour;
    }

}
