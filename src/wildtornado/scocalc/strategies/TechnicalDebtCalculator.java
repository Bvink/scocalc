package wildtornado.scocalc.strategies;

public class TechnicalDebtCalculator extends BaseCalculator {

    public TechnicalDebtCalculator(double val, double comp) {
        this.val = val;
        this.comp = comp;
    }

    public void generate() {
        if (val != comp) {
            this.result = val < comp ? (int) (Math.abs(val-comp) * 5) : 0;
        }
    }

}