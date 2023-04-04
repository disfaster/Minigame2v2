import controller.GameController;
import controller.GameException;
import view.ConsoleUI;

import java.util.Scanner;

/**
 * Launches the game.
 */
public class GameStart {

    public static void main(String[] args) throws GameException {
        boolean gameStarted = false;
        GameController gameController = new GameController();
        try {
            gameController.start();
            gameStarted = true;
        } catch (GameException e) {
            System.out.println(e.getMessage());
        }

        if (gameStarted) {
            System.out.println("Press 1 to start the game.");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            if (choice == 1) {
                ConsoleUI consoleUI = new ConsoleUI();
                consoleUI.startGame();
            } else {
                throw new GameException("Invalid input. Please enter 1 to start the game.");
            }
            input.close();
            System.exit(0);
        }
    }
}
