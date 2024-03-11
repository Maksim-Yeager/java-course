import Model.Model;
import org.junit.Test;

import static org.junit.Assert.*;

public class HangmanGameTest {

    Model model = new Model();

    @Test
    public void testNewGame() {
        Model model = new Model();
        model.newGame();
        assertEquals(6, model.getAttemptsLeft());
        assertFalse(model.isGameOver());
    }

    @Test
    public void testCorrectGuess() {
        model.newGame();
        assertTrue(model.makeGuess('a'));
        assertEquals("a____", model.getCurrentWordState());
    }

    @Test
    public void testIncorrectGuess() {
        model.newGame();
        assertFalse(model.makeGuess('z'));
        assertEquals(5, model.getAttemptsLeft());
    }

    // Think more here
    @Test
    public void testGameOverWin() {
        model.newGame();
        model.makeGuess('a');
        model.makeGuess('p');
        model.makeGuess('l');
        model.makeGuess('e');
        assertTrue(model.isGameOver());
        assertTrue(model.getCurrentWordState().equals("apple"));
    }

    @Test
    public void testGameOverLose() {
        model.newGame();
        model.makeGuess('z');
        model.makeGuess('x');
        model.makeGuess('y');
        model.makeGuess('w');
        model.makeGuess('v');
        model.makeGuess('u');
        assertTrue(model.isGameOver());
        assertFalse(model.getCurrentWordState().equals("banana"));
    }
}