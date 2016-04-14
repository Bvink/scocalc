package wildtornado.scocalc.strategies;

public class TechnicalDebtCalculator extends BaseCalculator {

    public void generate() {
        this.result = (int) Math.floor(val);
    }

}