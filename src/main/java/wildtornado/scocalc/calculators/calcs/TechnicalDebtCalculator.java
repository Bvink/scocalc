package wildtornado.scocalc.calculators.calcs;

import junit.framework.Assert;
import org.junit.Test;
import wildtornado.scocalc.calculators.BaseCalculator;
import wildtornado.scocalc.objects.DataInput;

public class TechnicalDebtCalculator extends BaseCalculator {

    public TechnicalDebtCalculator() {
        this.score = 5;
    }

    @Override
    public int generate(DataInput dp, DataInput comp) {

        int result = 0;

        if (!(Math.abs(dp.getTechnicalDebt() - comp.getTechnicalDebt()) < 0.00000001)) {
            result = dp.getTechnicalDebt() < comp.getTechnicalDebt() ? (int) (Math.abs(dp.getTechnicalDebt() - comp.getTechnicalDebt()) * score) : MIN_SCORE;
            result = putScoreWithinBounds(result);
        }
        return result;
    }

    /**
     * Test if the correct amount of points is assigned.
     */

    @Test
    public void testCalculation() {
        DataInput dp = new DataInput();
        DataInput comp = new DataInput();

        dp.setTechnicalDebt(50);
        comp.setTechnicalDebt(60);

        Assert.assertTrue(generate(dp, comp) == (comp.getTechnicalDebt() - dp.getTechnicalDebt()) * this.score);
    }

    /**
     * Test if the correct amount of points is assigned.
     */

    @Test
    public void testZeroPoints() {
        DataInput dp = new DataInput();
        DataInput comp = new DataInput();

        dp.setTechnicalDebt(60);
        comp.setTechnicalDebt(50);

        Assert.assertTrue(generate(dp, comp) == 0);
    }
}