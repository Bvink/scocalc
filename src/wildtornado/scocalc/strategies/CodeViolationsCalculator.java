package wildtornado.scocalc.strategies;

public class CodeViolationsCalculator extends BaseCalculator {

    public CodeViolationsCalculator(double val, double comp) {
        this.val = val;
        this.comp = comp;
    }

    public void generate() {
        this.result = val < comp ? (int) (Math.abs(val-comp) * 200) : 0;
        giveBonus(val == 0);
        putScoreWithinBounds(this.result);
    }

}