package wildtornado.scocalc.calculators.calcs;

import junit.framework.Assert;
import org.junit.Test;
import wildtornado.scocalc.calculators.BaseCalculator;
import wildtornado.scocalc.objects.DataInput;

public class CodeDuplicationCalculator extends BaseCalculator {

    public CodeDuplicationCalculator() {
        this.minimumAmount = 15;
        this.bonusAmount = 5;
        this.score = 25;
        this.bonusScore = 250;
    }

    @Override
    public int generate(DataInput dp, DataInput comp) {

        int result = 0;

        if (dp.getCodeDuplicationDensity() <= minimumAmount) {
            result = dp.getCodeDuplication() < comp.getCodeDuplication() ? (int) (Math.abs(dp.getCodeDuplication() - comp.getCodeDuplication()) * score) : MIN_SCORE;
            result += giveBonus(dp.getCodeDuplicationDensity() <= bonusAmount);
        }
        result = putScoreWithinBounds(result);
        return result;
    }

    /**
     * Test if the correct amount of points is assigned.
     */

    @Test
    public void testCalculation() {
        DataInput dp = new DataInput();
        DataInput comp = new DataInput();

        dp.setCodeDuplicationDensity(10);
        dp.setCodeDuplication(5);
        comp.setCodeDuplication(10);

        Assert.assertTrue(generate(dp, comp) == (comp.getCodeDuplication() - dp.getCodeDuplication()) * this.score);

        dp.setCodeDuplicationDensity(5);

        Assert.assertTrue(generate(dp, comp) == ((comp.getCodeDuplication() - dp.getCodeDuplication()) * this.score) + giveBonus(true));
    }
}
