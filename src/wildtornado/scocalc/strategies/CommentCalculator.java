package wildtornado.scocalc.strategies;

import wildtornado.scocalc.objects.DataInput;

public class CommentCalculator extends BaseCalculator {

    private double percentageVal;
    private double lineVal;
    private double lineComp;

    public CommentCalculator(DataInput dp, DataInput comp) {
        this.percentageVal = dp.getCommentPercentage();
        this.lineVal = dp.getCommentLines() - dp.getCommentedOutCodeLines();
        this.lineComp = comp.getCommentLines() - comp.getCommentedOutCodeLines();
    }

    public void generate() {
        if (lineVal != lineComp
                && percentageVal >= 10
                && percentageVal <= 20) {
            int temp = (int) ((lineVal - lineComp) * 50);
            putScoreWithinBounds(temp);
        } else {
            this.result = 0;
        }
    }

}