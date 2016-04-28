package wildtornado.scocalc.strategies;

public class TechnicalDebtCalculator extends BaseCalculator {

    public TechnicalDebtCalculator(int val) {
        this.val = val;
    }

    public void generate() {
        this.result = val;
    }

}