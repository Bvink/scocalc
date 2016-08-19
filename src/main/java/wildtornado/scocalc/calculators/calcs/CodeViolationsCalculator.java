package wildtornado.scocalc.calculators.calcs;

import junit.framework.Assert;
import org.junit.Test;
import wildtornado.scocalc.calculators.BaseCalculator;
import wildtornado.scocalc.objects.DataInput;

public class CodeViolationsCalculator extends BaseCalculator {

    public CodeViolationsCalculator() {
        this.bonusAmount = 25;
        this.score = 100;
    }

    @Override
    public int generate(DataInput dp, DataInput comp) {

        int result = 0;

        int maxBlockers = 0;
        int maxCriticals = 1;
        int maxMajors = 15;
        int maxMinors = 55;

        int criticalScoreBonus = 150;
        int majorScoreBonus = 75;

        if (Math.abs(dp.getBlockerViolations() - maxBlockers) < 0.00000001
                && dp.getCriticalViolations() <= maxCriticals
                && dp.getMajorViolations() <= maxMajors
                && dp.getMinorViolations() <= maxMinors) {

            result += calcPartialScore(dp.getCriticalViolations(), comp.getCriticalViolations(), score + criticalScoreBonus);
            result += calcPartialScore(dp.getMajorViolations(), comp.getMajorViolations(), score + majorScoreBonus);
            result += calcPartialScore(dp.getMinorViolations(), comp.getMinorViolations(), score);
            result += giveBonus(dp.getCodeViolations() <= bonusAmount);
            result = putScoreWithinBounds(result);
        }

        return result;
    }

    private int calcPartialScore(double val, double comp, int score) {
        return val < comp ? (int) (Math.abs(val - comp) * score) : MIN_SCORE;
    }

    /**
     * Test if the correct amount of points is assigned.
     */

    @Test
    public void testCriticalCalculation() {
        DataInput dp = new DataInput();
        DataInput comp = new DataInput();

        dp.setCriticalViolations(0);
        comp.setCriticalViolations(1);
        Assert.assertTrue(generate(dp, comp) == this.score + 150);
    }

    @Test
    public void testMajorCalculation() {
        DataInput dp = new DataInput();
        DataInput comp = new DataInput();

        dp.setMajorViolations(0);
        comp.setMajorViolations(1);
        Assert.assertTrue(generate(dp, comp) == this.score + 75);
    }

    @Test
    public void testMinorCalculation() {
        DataInput dp = new DataInput();
        DataInput comp = new DataInput();

        dp.setMinorViolations(0);
        comp.setMinorViolations(1);
        Assert.assertTrue(generate(dp, comp) == this.score);
    }

}