package wildtornado.scocalc.strategies;

public class LinesOfCodeCalculator extends BaseCalculator {

    public LinesOfCodeCalculator(double val, double comp) {
        this.val = val;
        this.comp = comp;
    }

    public void generate() {
        if (val != comp) {
            this.result = val > comp ? (int) (Math.abs(val-comp) * 20) : (int) Math.abs(val-comp) * 10;
        }
    }

}