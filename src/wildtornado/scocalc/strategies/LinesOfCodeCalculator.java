package wildtornado.scocalc.strategies;

public class LinesOfCodeCalculator extends BaseCalculator {

    public LinesOfCodeCalculator(int val) {
        this.val = val;
    }

    public void generate() {
        this.result = val;
    }

}