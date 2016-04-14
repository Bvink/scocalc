package wildtornado.scocalc.strategies;

public class BaseCalculator implements Calculator {

    protected double val;
    protected int score;
    protected int result;

    public void setVal(String val, int score) {
        this.val = Double.parseDouble(val);
        this.score = score;
    }

    public void generate() {
        this.result = score + (int) Math.floor(val);
    }

    public int getResult() {
        return result;
    }
}
