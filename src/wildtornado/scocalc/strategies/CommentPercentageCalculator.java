package wildtornado.scocalc.strategies;

public class CommentPercentageCalculator extends BaseCalculator {

    public CommentPercentageCalculator(int val) {
        this.val = val;
    }

    public void generate() {
        this.result = score + val;
    }

}