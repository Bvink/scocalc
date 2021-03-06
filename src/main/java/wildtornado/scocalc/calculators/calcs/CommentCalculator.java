package wildtornado.scocalc.calculators.calcs;

import org.junit.Assert;
import org.junit.Test;
import wildtornado.scocalc.calculators.BaseCalculator;
import wildtornado.scocalc.objects.DataInput;

public class CommentCalculator extends BaseCalculator {

    public CommentCalculator() {
        this.score = 10;
        this.minimumAmount = 10;
        this.maximumAmount = 20;
    }

    @Override
    public int generate(DataInput dp, DataInput comp) {

        int result;

        double lineVal = dp.getCommentLines() - dp.getCommentedOutCodeLines();
        double lineComp = comp.getCommentLines() - comp.getCommentedOutCodeLines();

        if (!(Math.abs(lineVal - lineComp) < 0.00000001)
                && dp.getCommentPercentage() >= minimumAmount
                && dp.getCommentPercentage() <= maximumAmount) {
            int temp = (int) ((lineVal - lineComp) * score);
            result = putScoreWithinBounds(temp);
        } else {
            result = MIN_SCORE;
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

        dp.setCommentLines(100);
        comp.setCommentLines(50);
        dp.setCommentPercentage(15);

        System.out.println(generate(dp, comp));

        Assert.assertTrue(generate(dp, comp) == (dp.getCommentLines() - comp.getCommentLines()) * this.score);
    }

}