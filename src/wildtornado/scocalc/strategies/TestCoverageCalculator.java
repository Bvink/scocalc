package wildtornado.scocalc.strategies;

public class TestCoverageCalculator extends BaseCalculator {

    public TestCoverageCalculator(double val) {
        this.val = val;
    }

    public void generate() {
        this.result = (int) val;
    }

}