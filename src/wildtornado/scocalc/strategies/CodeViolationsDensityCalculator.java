package wildtornado.scocalc.strategies;

public class CodeViolationsDensityCalculator extends BaseCalculator {

    public CodeViolationsDensityCalculator(double val, double comp) {
        this.val = val;
        this.comp = comp;
    }

    public void generate() {
        this.result = (int) val;
        ;
    }

}