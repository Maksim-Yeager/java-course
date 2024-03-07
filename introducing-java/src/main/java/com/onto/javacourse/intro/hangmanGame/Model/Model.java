package Model;

import java.util.Random;

public class Model {

    private String[] words = {"apple", "banana", "orange", "grape", "pear"};
    private String secretWord;
    private StringBuilder currentWordState;
    private int attemptsLeft;

    public void newGame() {
        Random random = new Random();
        secretWord = words[random.nextInt(words.length)];
        currentWordState = new StringBuilder("_".repeat(secretWord.length()));
        attemptsLeft = 6;
    }

    public boolean makeGuess(char guess) {
        boolean correctGuess = false;
        for (int i = 0; i < secretWord.length(); i++) {
            if (secretWord.charAt(i) == guess) {
                currentWordState.setCharAt(i, guess);
                correctGuess = true;
            }
        }
        if (!correctGuess) {
            attemptsLeft--;
        }
        return correctGuess;
    }

    public String getCurrentWordState() {
        return currentWordState.toString();
    }

    public int getAttemptsLeft() {
        return attemptsLeft;
    }

    public boolean isGameOver() {
        return attemptsLeft == 0 || !currentWordState.toString().contains("_");
    }

    public String getSecretWord() {
        return secretWord;
    }
}
