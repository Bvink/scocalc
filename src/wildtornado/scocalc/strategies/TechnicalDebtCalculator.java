package wildtornado.scocalc.strategies;

public class TechnicalDebtCalculator extends BaseCalculator {

    public TechnicalDebtCalculator(double val, double comp) {
        this.val = val;
        this.comp = comp;
    }

    public void generate() {
        this.result = (int) val;
    }

}