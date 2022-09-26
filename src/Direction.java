public enum Direction {
    SOUTH(1, 0),
    EAST(0, 1),
    WEST(0, -1),
    MAIN_DIAGONAL(1, -1),
    INVERSE_DIAGONAL(1, 1);
    private final int x;
    private final int y;

    Direction(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
