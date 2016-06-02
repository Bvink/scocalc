package wildtornado.scocalc.calculators.calcs;

import wildtornado.scocalc.calculators.BaseCalculator;
import wildtornado.scocalc.objects.DataInput;

public class CommentCalculator extends BaseCalculator {

    public CommentCalculator() {
        this.score = 50;
        this.minimumAmount = 10;
        this.maximumAmount = 20;
        this.bonusAmount = 5;
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

}