package models;

import types.Color;

public class UserPlayer extends Player {
    public UserPlayer(Color color) {
        super(color);
    }

    @Override
    public void addToken(Board board) {
        board.addToken(playerView.writeTurn(this), super.color);
    }
}
