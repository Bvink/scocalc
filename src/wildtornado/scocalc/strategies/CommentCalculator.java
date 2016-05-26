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

        this.score = 50;
        this.minimumAmount = 10;
        this.maximumAmount = 20;
        this.bonusAmount = 5;
    }

    public void generate() {
        if (lineVal != lineComp
                && percentageVal >= minimumAmount
                && percentageVal <= maximumAmount) {
            int temp = (int) ((lineVal - lineComp) * score);
            putScoreWithinBounds(temp);
        } else {
            this.result = minScore;
        }
    }

}