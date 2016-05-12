package wildtornado.scocalc.strategies;

public class TestCoverageCalculator extends BaseCalculator {

    public TestCoverageCalculator(double val, double comp) {
        this.val = val;
        this.comp = comp;
    }

    public void generate() {
        this.result = (int) val;
    }

}