package wildtornado.scocalc.strategies;

public class CommentPercentageCalculator extends BaseCalculator {

    public CommentPercentageCalculator(double val) {
        this.val = val;
    }

    public void generate() {
        this.result = (int) val;
    }

}