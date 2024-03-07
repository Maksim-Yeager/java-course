package View;

import interfaces.ViewInterface;

import java.util.Scanner;

public class ConsoleView implements ViewInterface {
    private Scanner scanner = new Scanner(System.in);

    public char getGuess() {
        System.out.print("Enter your guess: ");
        return scanner.next().charAt(0);
    }

    public void displayWordState(String wordState) {
        System.out.println("Current word state: " + wordState);
    }

    public void displayAttemptsLeft(int attemptsLeft) {
        System.out.println("Attempts left: " + attemptsLeft);
    }

    public void displayGameOver(boolean win, String secretWord) {
        if (win) {
            System.out.println("Congratulations! You guessed the word: " + secretWord);
        } else {
            System.out.println("Game over! The word was: " + secretWord);
        }
    }
}
