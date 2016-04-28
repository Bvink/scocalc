package wildtornado.scocalc.strategies;

public class BaseCalculator implements Calculator {

    protected int val;
    protected int score;
    protected int result;

    public void generate() {
        this.result = score + val;
    }

    public int run() {
        this.generate();
        return result;
    }
}
