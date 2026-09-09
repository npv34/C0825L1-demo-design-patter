package src.BehavioralDesign.TemplateMethod;

public class ChessGame extends Game {
    
   @Override
    protected void initGame() {
        System.out.println("Initializing chess game...");
    }

    @Override
    protected void startGame() {
        System.out.println("Starting chess game...");
    }

    @Override
    protected void endGame() {
        System.out.println("Ending chess game...");
    }
}
