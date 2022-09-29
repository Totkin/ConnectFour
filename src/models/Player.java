package models;

import types.Color;
import views.PlayerView;

public abstract class Player {
    protected final Color color;
    protected final PlayerView playerView = new PlayerView();

    public Player(Color color) {
        this.color = color;
    }

    public abstract void addToken(Board board);

    public Color getColor() {
        return this.color;
    }
}
