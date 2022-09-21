package ConnectFour;

public class Player {
    public Token token;
    public Player(String color) {
        this.token=new Token(color);
    }
}
