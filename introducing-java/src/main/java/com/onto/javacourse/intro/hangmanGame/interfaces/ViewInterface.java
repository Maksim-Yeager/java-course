package interfaces;

import java.util.Scanner;

public interface ViewInterface {
    Scanner scanner = new Scanner(System.in);
    char getGuess();
    void displayWordState(String wordState);
    void displayAttemptsLeft(int attemptsLeft);
    void displayGameOver(boolean win, String secretWord);
}
