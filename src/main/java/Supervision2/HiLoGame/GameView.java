package Supervision2.HiLoGame;

import java.util.Scanner;

public class GameView {
    private static final Scanner scanner = new Scanner(System.in);

    public static int getGuess() {
        while (true) {
            System.out.print("Enter your guess: ");
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid natural number.");
            }
        }
    }

    public static void showResult(String result) {
        System.out.println(result);
    }

    public static boolean gameOver() {
        System.out.println("Game Over!");

        while (true) {
            System.out.print("Would you like to play again? (y/n): ");
            String answer = scanner.nextLine().trim();

            if (answer.equalsIgnoreCase("y")) {
                return true;
            }
            if (answer.equalsIgnoreCase("n")) {
                return false;
            }

            System.out.println("Please enter y or n.");
        }
    }
    public static String getPlayerName() {
        while (true) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine().trim();

            if (!name.isEmpty()) {
                return name;
            }

            System.out.println("Name cannot be empty.");
        }
    }
}