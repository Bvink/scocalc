package wildtornado.scocalc.calculators.calcs;

import wildtornado.scocalc.calculators.BaseCalculator;
import wildtornado.scocalc.objects.DataInput;

public class TestCoverageCalculator extends BaseCalculator {

    public TestCoverageCalculator() {
        this.minimumAmount = 55;
        this.bonusAmount = 80;
        this.score = 200;
    }

    @Override
    public int generate(DataInput dp, DataInput comp) {

        int result = 0;

        double testVal = dp.getNumberOfTests() - (dp.getTestErrors() + dp.getTestFailures());
        double testComp = comp.getNumberOfTests() - (comp.getTestErrors() + comp.getTestFailures());

        if (dp.getTestCoverage() >= minimumAmount) {
            result = testVal < testComp ? (int) (Math.abs(testVal - testComp) * score) : MIN_SCORE;
            result += giveBonus(dp.getTestCoverage() > bonusAmount);
        }
        result = putScoreWithinBounds(result);
        return result;
    }

}