package wildtornado.scocalc.strategies;

public abstract class BaseCalculator implements Calculator {

    protected double val;
    protected double comp;
    protected final int minScore = 0;
    protected final int maxScore = 1000;
    protected int result;

    public void generate() {
        this.result = maxScore;
    }

    public int run() {
        this.generate();
        return result;
    }

    public void putScoreWithinBounds(int temp) {
        this.result = temp > minScore ? temp : minScore;
        this.result = temp <= maxScore ? temp : maxScore;
    }
}
