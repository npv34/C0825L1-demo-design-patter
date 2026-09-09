package src.BehavioralDesign.TemplateMethod;

public abstract class Game {
    protected abstract void initGame();
    protected abstract void startGame();
    protected abstract void endGame();
    public void play() {
        initGame();
        startGame();
        endGame();
    }
}
