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
        this.result = (int) val;
    }

}