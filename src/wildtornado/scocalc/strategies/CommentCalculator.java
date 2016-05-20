package wildtornado.scocalc.strategies;

public class CommentCalculator extends BaseCalculator {

    private double lineVal;
    private double lineComp;

    public CommentCalculator(double val, double lineVal, double lineComp, double codeLineVal, double codeLineValComp) {
        this.val = val;
        this.lineVal = lineVal - codeLineVal;
        this.lineComp = lineComp - codeLineValComp;
    }

    public void generate() {
        if (lineVal != lineComp
                && val >= 10
                && val <= 20) {
            int temp = (int) ((lineVal - lineComp) * 50);
            putScoreWithinBounds(temp);
        } else {
            this.result = 0;
        }
    }

}