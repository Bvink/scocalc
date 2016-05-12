package wildtornado.scocalc.strategies;

public class CodeComplexityCalculator extends BaseCalculator {

    public CodeComplexityCalculator(double val, double comp) {
        this.val = val;
        this.comp = comp;
    }

    public void generate() {
        this.result = (int) val;
    }

}
