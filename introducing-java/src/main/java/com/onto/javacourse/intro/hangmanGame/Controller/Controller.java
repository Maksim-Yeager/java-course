package Controller;

import Model.Model;
import View.ConsoleView;

/**
 * The Controller class controls the flow of the Hangman game by coordinating
 * interactions between the model and the view.
 */
public class Controller {
    private Model model;
    private ConsoleView view;

    /**
     * Constructs a new Controller with the specified model and view.
     *
     * @param model The model component of the Hangman game.
     * @param view  The view component of the Hangman game.
     */
    public Controller(Model model, ConsoleView view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Starts a new game of Hangman.
     */
    public void startGame() {
        model.newGame();
        while (!model.isGameOver()) {
            view.displayWordState(model.getCurrentWordState());
            view.displayAttemptsLeft(model.getAttemptsLeft());
            char guess = view.guess();
            boolean correctGuess = model.makeGuess(guess);
            if (correctGuess) {
                System.out.println("Correct guess");
            } else {
                System.out.println("Incorrect guess");
            }
        }
        view.displayGameOver(model.getCurrentWordState().contains("_"), model.getSecretWord());
    }
}