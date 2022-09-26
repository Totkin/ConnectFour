public class Turn {
    int turn = 1;
    public int takeTurn(){
        return turn = (++turn) % 2;
    }
    public int thisTurn(){
        return this.turn;
    }
}
