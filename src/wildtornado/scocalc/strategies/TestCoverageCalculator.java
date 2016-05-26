package wildtornado.scocalc.strategies;

import wildtornado.scocalc.objects.DataInput;

public class TestCoverageCalculator extends BaseCalculator {

    private double coverageVal;
    private double testVal;
    private double testComp;

    public TestCoverageCalculator(DataInput dp, DataInput comp) {
        this.coverageVal = dp.getTestCoverage();
        this.testVal = dp.getNumberOfTests() - (dp.getTestErrors() + dp.getTestFailures());
        this.testComp = comp.getNumberOfTests() - (comp.getTestErrors() + comp.getTestFailures());
    }

    public void generate() {
        if (coverageVal >= 55) {
            this.result = testVal < testComp ? (int) (Math.abs(testVal - testComp) * 200) : 0;
            giveBonus(coverageVal > 80);
        }
        putScoreWithinBounds(this.result);
    }

}