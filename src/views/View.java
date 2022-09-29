package views;

import models.Board;
import models.Player;

public class View {
    private final BoardView boardView;
    private final StartView startView;
    private final PlayerView playerView;

    public View() {
        boardView = new BoardView();
        startView = new StartView();
        playerView = new PlayerView();
    }

    public int gameInit() {
        return startView.gameInit();
    }

    public void writeBoard(Board board) {
        boardView.write(board);
    }

    public void writeWinner(Player player) {
        playerView.writeWinner(player);
    }
}
