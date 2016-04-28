package wildtornado.scocalc.strategies;

public class BaseCalculator implements Calculator {

    protected int val;
    protected final int maxScore = 10000;
    protected int result;

    public void generate() {
        this.result = val;
    }

    public int run() {
        this.generate();
        return result;
    }
}
