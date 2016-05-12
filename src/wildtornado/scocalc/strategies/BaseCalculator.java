package wildtornado.scocalc.strategies;

public abstract class BaseCalculator implements Calculator {

    protected double val;
    protected double comp;
    protected final int maxScore = 10000;
    protected int result;

    public void generate() {
        this.result = maxScore;
    }

    public int run() {
        this.generate();
        return result;
    }
}
