public class Board {

    private final int ROWS = 6;
    private final int COLUMNS = 7;
    private Coordinate[][] squares = new Coordinate[ROWS][COLUMNS];
    private Coordinate lastSquare;

    public Board() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                squares[i][j] = new Coordinate(Color.NULL);
            }
        }
    }

    public void paint() {
        String row;
        String graphicBoard = "";
        for (int i = 0; i < ROWS; i++) {
            row = "";
            for (int j = 0; j < COLUMNS; j++) {
                row += squares[i][j].getColor().getCode() + " ";
            }
            graphicBoard += row + "\n";
        }
        System.out.println(graphicBoard);
    }

    public boolean addToken(int column, Color color){
        boolean added= false;
        if(column >= 0 && column < COLUMNS && squares[0][column].hasColor(Color.NULL)){
            int i= ROWS-1;
            while(!squares[i][column].hasColor(Color.NULL)){
                i--;
            }
            squares[i][column] = new Coordinate(i,column,color);
            lastSquare= squares[i][column];
        }
        return added;
    }
    public boolean hasFourConnected() {
        int counter = 1;
        int i=0;
        boolean hasFour = false;
        Direction[] directions= Direction.values();
        Coordinate initialSquare= lastSquare;
        Coordinate actualSquare= lastSquare;
        while(i< directions.length && counter<4) {
            if(actualSquare.equals(nextCoordinate(actualSquare, directions[i]))) {
                counter++;
                actualSquare = nextCoordinate(actualSquare, directions[i]);
            }else{
                if(directions[i] != Direction.EAST) {
                    counter = 1;
                }
                i++;
                actualSquare= initialSquare;
            }
        }
        if(counter==4){
            hasFour=true;
        }
        return hasFour;
    }

    private Coordinate nextCoordinate(Coordinate square, Direction direction){
        Coordinate next = null;
        try {
            if (direction == Direction.SOUTH) {
                next = squares[square.getX() + 1][square.getY()];
            } else if (direction == Direction.EAST) {
                next = squares[square.getX()][square.getY() + 1];
            } else if (direction == Direction.WEST) {
                next = squares[square.getX()][square.getY() - 1];
            } else if (direction == Direction.MAIN_DIAGONAL) {
                next = squares[square.getX() + 1][square.getY() - 1];
            } else if (direction == Direction.INVERSE_DIAGONAL) {
                next = squares[square.getX() + 1][square.getY() + 1];
            }
        }catch (ArrayIndexOutOfBoundsException e){
            next = null;
        }
        return next;
    }

}
