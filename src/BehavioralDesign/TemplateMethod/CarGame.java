package src.BehavioralDesign.TemplateMethod;

public class CarGame extends Game {

    @Override
    protected void initGame() {
        System.out.println("Initializing car game...");
    }

    @Override
    protected void startGame() {
        System.out.println("Starting car game...");
    }

    @Override
    protected void endGame() {
        System.out.println("Ending car game...");
    }

}
