package View;

import interfaces.ViewInterface;

import java.util.Scanner;

/**
 * The ConsoleView class implements the ViewInterface for displaying the Hangman game in the console.
 */
public class ConsoleView implements ViewInterface {
    private Scanner scanner = new Scanner(System.in);

    /**
     * Prompts the user to enter a guess.
     *
     * @return The character guessed by the user.
     */
    public char guess() {
        System.out.print("Your guess: ");
        return scanner.next().charAt(0);
    }

    /**
     * Displays the current state of the word being guessed.
     *
     * @param wordState The current state of the word.
     */
    public void displayWordState(String wordState) {
        System.out.println("Word state: " + wordState);
    }

    /**
     * Displays the number of attempts left.
     *
     * @param attemptsLeft The number of attempts left.
     */
    public void displayAttemptsLeft(int attemptsLeft) {
        System.out.println("Attempts left: " + attemptsLeft);
    }

    /**
     * Displays the game over message.
     *
     * @param win        true if the player won, false if the player lost.
     * @param secretWord The secret word that the player was trying to guess.
     */
    public void displayGameOver(boolean win, String secretWord) {
        if (win) {
            System.out.println("Congratulations! The word is " + secretWord);
        } else {
            System.out.println("Game over! The word was: " + secretWord);
        }
    }
}