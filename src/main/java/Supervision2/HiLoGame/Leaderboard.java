package Supervision2.HiLoGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class Leaderboard {
    List<GameResult> results;

    Leaderboard() {
        results = new ArrayList<>();
    }

    public void addResult(GameResult result) {
        results.add(result);
    }
    public String showResults() {
        List<GameResult> sorted = new ArrayList<>(results);

        sorted.sort(
                Comparator.comparingInt(GameResult::score).reversed()
        );

        StringBuilder sb = new StringBuilder("Leaderboard:\n");

        for (GameResult result : sorted) {
            sb.append(result.player().name())
                    .append(": ")
                    .append(result.score())
                    .append(" points\n");
        }
        return sb.toString();
    }
}
