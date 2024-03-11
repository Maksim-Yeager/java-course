package Model;

import java.util.Random;

/**
 * The Model class represents the underlying data and logic of the Hangman game.
 */
public class Model {

    private String[] words = {"apple", "banana", "orange", "grape", "pear"};
    private String secretWord;
    private StringBuilder wordState;
    private int attemptsLeft;

    /**
     * Initializes a new game of Hangman by selecting a random word from the list of words.
     */
    public void newGame() {
        Random random = new Random();
        secretWord = words[random.nextInt(words.length)];
        wordState = new StringBuilder("_".repeat(secretWord.length()));
        attemptsLeft = 6;
    }

    /**
     * Processes a guess from the player.
     *
     * @param guess The character guessed by the player.
     * @return true if the guess is correct, false otherwise.
     */
    public boolean makeGuess(char guess) {
        boolean correctGuess = false;
        for (int i = 0; i < secretWord.length(); i++) {
            if (secretWord.charAt(i) == guess) {
                wordState.setCharAt(i, guess);
                correctGuess = true;
            }
        }
        if (!correctGuess) {
            attemptsLeft--;
        }
        return correctGuess;
    }

    /**
     * Retrieves the current state of the word being guessed.
     *
     * @return The current word state as a string.
     */
    public String getCurrentWordState() {
        return wordState.toString();
    }

    /**
     * Retrieves the number of attempts left.
     *
     * @return The number of attempts left.
     */
    public int getAttemptsLeft() {
        return attemptsLeft;
    }

    /**
     * Checks if the game is over.
     *
     * @return true if the game is over, false otherwise.
     */
    public boolean isGameOver() {
        return attemptsLeft == 0 || !wordState.toString().contains("_");
    }

    /**
     * Retrieves the secret word.
     *
     * @return The secret word.
     */
    public String getSecretWord() {
        return secretWord;
    }
}
