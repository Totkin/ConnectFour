package models;

import types.Color;

public class MachinePlayer extends Player {
    public MachinePlayer(Color color) {
        super(color);
    }
    @Override
    public boolean addToken(Board board) {
        playerView.writeTurn(this);
        return board.addToken((int)(Math.random() * 7), this.color);
    }
}
