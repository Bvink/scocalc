package wildtornado.scocalc.strategies;

public class CodeViolationsDensityCalculator extends BaseCalculator {

    public CodeViolationsDensityCalculator(double val) {
        this.val = val;
    }

    public void generate() {
        this.result = (int) val;;
    }

}