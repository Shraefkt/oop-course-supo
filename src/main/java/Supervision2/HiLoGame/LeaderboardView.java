package Supervision2.HiLoGame;

import java.util.Scanner;

public class LeaderboardView {
    private static final Scanner scanner = new Scanner(System.in);

    public static void showLeaderboard(Leaderboard l) {

        System.out.println(l.showResults());
    }
}