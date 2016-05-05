package wildtornado.scocalc.strategies;

public class TechnicalDebtCalculator extends BaseCalculator {

    public TechnicalDebtCalculator(double val) {
        this.val = val;
    }

    public void generate() {
        this.result = (int) val;
    }

}