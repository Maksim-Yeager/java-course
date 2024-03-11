package interfaces;

/**
 * The ViewInterface interface represents the view component of the Hangman game.
 * It defines methods for interacting with the user and displaying game-related information.
 */
public interface ViewInterface {

    /**
     * Gets the user's guess input.
     *
     * @return The character representing the user's guess.
     */
    char guess();

    /**
     * Displays the current state of the word being guessed.
     *
     * @param wordState The current state of the word, with guessed letters revealed and unguessed letters masked.
     */
    void displayWordState(String wordState);

    /**
     * Displays the number of attempts left for the player.
     *
     * @param attemptsLeft The number of attempts left for the player to guess the word.
     */
    void displayAttemptsLeft(int attemptsLeft);

    /**
     * Displays the game over message indicating whether the player won or lost,
     * and reveals the secret word if the player lost.
     *
     * @param win        Indicates whether the player won the game (true) or lost (false).
     * @param secretWord The secret word that was being guessed.
     */
    void displayGameOver(boolean win, String secretWord);
}

