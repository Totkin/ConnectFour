package models;

import types.Color;

public class MachinePlayer extends Player {
    public MachinePlayer(Color color) {
        super(color);
    }

    @Override
    public void addToken(Board board) {
        playerView.writeTurn(this);
        board.addToken((int) (Math.random() * 7), this.color);
    }
}
