package wildtornado.scocalc.calculators.calcs;

import junit.framework.Assert;
import org.junit.Test;
import wildtornado.scocalc.calculators.BaseCalculator;
import wildtornado.scocalc.objects.DataInput;

public class LinesOfCodeCalculator extends BaseCalculator {


    public LinesOfCodeCalculator() {
        this.score = 10;
    }

    @Override
    public int generate(DataInput dp, DataInput comp) {

        int result = 0;

        if (!(Math.abs(dp.getLinesOfCode() - comp.getLinesOfCode()) < 0.00000001)) {
            result = dp.getLinesOfCode() > comp.getLinesOfCode() ? (int) (Math.abs(dp.getLinesOfCode() - comp.getLinesOfCode()) * score) : (int) Math.abs(dp.getLinesOfCode() - comp.getLinesOfCode()) * (score / 2);
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

        dp.setLinesOfCode(50);
        comp.setLinesOfCode(100);

        Assert.assertTrue(generate(dp, comp) == Math.abs((comp.getLinesOfCode() - dp.getLinesOfCode())) * this.score / 2);

        dp.setLinesOfCode(100);
        comp.setLinesOfCode(50);

        Assert.assertTrue(generate(dp, comp) == Math.abs((comp.getLinesOfCode() - dp.getLinesOfCode())) * this.score);
    }

    /**
     * Test if the correct amount of points is assigned.
     */

    @Test
    public void testBounds() {
        DataInput dp = new DataInput();
        DataInput comp = new DataInput();

        dp.setLinesOfCode(10000);
        comp.setLinesOfCode(100);

        Assert.assertTrue(generate(dp, comp) == 1000);
    }

}