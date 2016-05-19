package wildtornado.scocalc.strategies;

public class CommentPercentageCalculator extends BaseCalculator {

    private double lineVal;
    private double lineComp;

    public CommentPercentageCalculator(double val, double comp, double lineVal, double lineComp) {
        this.val = val;
        this.comp = comp;
        this.lineVal = lineVal;
        this.lineComp = lineComp;
    }

    public void generate() {
        if (lineVal != lineComp
                && val >= 10
                && val <= 20) {
            int temp = (int) ((lineVal - lineComp) * 20);
            putScoreWithinBounds(temp);
        } else {
            this.result = 0;
        }
    }

}