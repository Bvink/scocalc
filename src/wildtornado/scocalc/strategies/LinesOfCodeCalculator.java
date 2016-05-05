package wildtornado.scocalc.strategies;

public class LinesOfCodeCalculator extends BaseCalculator {

    public LinesOfCodeCalculator(double val) {
        this.val = val;
    }

    public void generate() {
        this.result = (int) val;
    }

}