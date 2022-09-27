package models;

import interfaces.Player;
import types.Color;

public class MachinePlayer extends Player {
    public MachinePlayer(Color color) {
        super(color);
    }

    @Override
    public void addToken(Board board) {
        boolean added;
        System.out.println("Machine " + super.color + " turn");
        System.out.println("The machine has chosen the column:");
        do {
            added = board.addToken((int) (Math.random() * 7), this.color);
        } while (!added);
    }
}
