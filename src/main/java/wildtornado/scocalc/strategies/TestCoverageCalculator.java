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

        this.minimumAmount = 55;
        this.bonusAmount = 80;
        this.score = 200;
    }

    @Override
    public void generate() {
        if (coverageVal >= minimumAmount) {
            this.result = testVal < testComp ? (int) (Math.abs(testVal - testComp) * score) : MIN_SCORE;
            giveBonus(coverageVal > bonusAmount);
        }
        putScoreWithinBounds(this.result);
    }

}