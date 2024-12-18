package lesson12.problem1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        takeScore();
    }

    public static void takeScore() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter a score 0 to 100: ");
        try {
            int score = scanner.nextInt();
            if (score < 0 || score > 100) {
                throw new UnsupportedOperationException("Error: Score is out of range.");
            } else System.out.println("The score is " + score + "!");
        } catch (InputMismatchException e) {
            System.out.println("Error: Only integer expected!");
            takeScore();
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
            takeScore();
        } finally {
            scanner.close();
        }
    }
}
