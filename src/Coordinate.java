public class Coordinate {
    private int x;
    private int y;
    private Color color;

    public Coordinate(int x, int y, Color color){
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Coordinate(Color color){
        this.color = color;
    }
    public Coordinate(int x, int y){
        this.x = x;
        this.y = y;
    }

    public boolean hasColor(Color color){
        return this.color == color;
    }
    public Color getColor(){
        return color;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public Coordinate south() {
        return new Coordinate(x+1,y);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        Coordinate square= (Coordinate) obj;
        return this.color == square.color;
    }
}
