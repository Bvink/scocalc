package wildtornado.scocalc.strategies;

public class LinesOfCodeCalculator extends BaseCalculator {

    public LinesOfCodeCalculator(double val, double comp) {
        this.val = val;
        this.comp = comp;
    }

    public void generate() {
        this.result = (int) val;
    }

}