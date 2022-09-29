package views;

import models.Board;
import models.Player;

public class View {
    private final BoardView boardView;
    private final GameView gameView;
    private final PlayerView playerView;

    public View() {
        boardView = new BoardView();
        gameView = new GameView();
        playerView = new PlayerView();
    }

    public int gameInit() {
        return gameView.gameInit();
    }

    public void writeBoard(Board board) {
        boardView.write(board);
    }

    public void writeWinner(Player player) {
        playerView.writeWinner(player);
    }
}
