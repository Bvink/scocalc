package wildtornado.scocalc.strategies;

public class CodeComplexityCalculator extends BaseCalculator {

    public CodeComplexityCalculator(double val) {
        this.val = val;
    }

    public void generate() {
        this.result = (int) val;
    }

}
