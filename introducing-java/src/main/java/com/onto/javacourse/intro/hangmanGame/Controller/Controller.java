package Controller;

import Model.Model;
import View.ConsoleView;

public class Controller {
    private Model model;
    private ConsoleView view;

    public Controller(Model model, ConsoleView view) {
        this.model = model;
        this.view = view;
    }

    public void startGame() {
        model.newGame();
        while (!model.isGameOver()) {
            view.displayWordState(model.getCurrentWordState());
            view.displayAttemptsLeft(model.getAttemptsLeft());
            char guess = view.getGuess();
            boolean correctGuess = model.makeGuess(guess);
            if (correctGuess) {
                System.out.println("Correct guess!");
            } else {
                System.out.println("Incorrect guess!");
            }
        }
        view.displayGameOver(model.getCurrentWordState().contains("_"), model.getSecretWord());
    }
}
