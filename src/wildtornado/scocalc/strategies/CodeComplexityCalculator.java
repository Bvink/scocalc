package wildtornado.scocalc.strategies;

public class CodeComplexityCalculator extends BaseCalculator {

    public CodeComplexityCalculator(int val) {
        this.val = val;
    }

    public void generate() {
        this.result = score + val;
    }

}
