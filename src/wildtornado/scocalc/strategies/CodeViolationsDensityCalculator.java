package wildtornado.scocalc.strategies;

public class CodeViolationsDensityCalculator extends BaseCalculator {

    public CodeViolationsDensityCalculator(int val) {
        this.val = val;
    }

    public void generate() {
        this.result = score + val;
    }

}