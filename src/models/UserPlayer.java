package models;

import types.Color;

public class UserPlayer extends Player {
    public UserPlayer(Color color) {
        super(color);
    }

    @Override
    public boolean addToken(Board board) {
        return board.addToken(playerView.writeTurn(this), super.color);
    }
}
