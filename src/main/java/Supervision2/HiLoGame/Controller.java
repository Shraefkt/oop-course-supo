package Supervision2.HiLoGame;

public class Controller {
    private GameState game;
    private Leaderboard leaderboard = new Leaderboard();
    public void startGame() {
        boolean replay = true;
        while (replay) {
            Player player = new Player(GameView.getPlayerName());
            game = new GameState(Difficulty.EASY);
            while(!game.isGameOver()) {
                String result = game.checkGuess(GameView.getGuess());
                GameView.showResult(result);
            }
            replay = GameView.gameOver();
            GameResult gameResult = new GameResult(player,game.getScore());
            leaderboard.addResult(gameResult);
            LeaderboardView.showLeaderboard(leaderboard);
        }
    }
    public void main(String[] args) {
        this.startGame();
    }
}
