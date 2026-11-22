package Supervision2.HiLoGame;

public class GameState {
    private final int secretNumber;
    private int hi_range;
    private int maxGuesses;
    private int guessesUsed;
    private int score;

    GameState(Difficulty difficulty) {
        switch (difficulty) {
            case EASY:
                hi_range=10;
                maxGuesses=10;
                break;
            case MEDIUM:
                hi_range=100;
                maxGuesses=50;
                break;
            case HARD:
                hi_range=100;
                maxGuesses=10;
                break;
        }
        secretNumber = (int)(Math.random() * hi_range);
        guessesUsed = 0;
        score =0;
    }

    public boolean isGameOver() {
        return (guessesUsed >= maxGuesses) || (score > 0);
    }
    public int getScore() {
        return score;
    }
    public String checkGuess(int guess) {
        if (isGameOver()) {
            return "Game Over";
        }
        guessesUsed +=1;
        if (guess > secretNumber) {
            return "go lower";
        } else if (guess < secretNumber) {
            return "go higher";
        } else {
            score = maxGuesses-guessesUsed;
            return "correct\nScore: " + score;
        }
    }


}
