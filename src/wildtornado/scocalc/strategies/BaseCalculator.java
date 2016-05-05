package wildtornado.scocalc.strategies;

public abstract class BaseCalculator implements Calculator {

    protected double val;
    protected final int maxScore = 10000;
    protected int result;

    public void generate(double val) {
        this.result = (int) val;
    }

    public int run() {
        this.generate();
        return result;
    }
}
