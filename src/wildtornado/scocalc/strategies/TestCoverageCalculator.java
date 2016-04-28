package wildtornado.scocalc.strategies;

public class TestCoverageCalculator extends BaseCalculator {

    public TestCoverageCalculator(int val) {
        this.val = val;
    }

    public void generate() {
        this.result = val;
    }

}