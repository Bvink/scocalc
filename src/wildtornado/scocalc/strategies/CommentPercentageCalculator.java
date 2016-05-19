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
        if(lineVal != lineComp) {
            if (val >= 10 && val <= 20) {
                int temp = (int) ((lineVal - lineComp) * 200);
                this.result = temp > 0 ? temp : 0;
                this.result = temp <= 10000 ? temp : 10000;
            } else {
                this.result = 0;
            }
        }
    }

}