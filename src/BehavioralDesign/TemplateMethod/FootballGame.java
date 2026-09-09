package src.BehavioralDesign.TemplateMethod;

public class FootballGame {
    public void initGame() {
        System.out.println("Initializing game...");
    }

    public void startGame() {
        System.out.println("Starting game...");
    }

    public void endGame() {
        System.out.println("Ending game...");
    }

    public void play() {
        initGame();
        startGame();
        endGame();
    }
}
