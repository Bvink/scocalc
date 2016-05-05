package wildtornado.scocalc.strategies;

public class CodeDuplicationDensityCalculator extends BaseCalculator {

    public CodeDuplicationDensityCalculator(double val) {
        this.val = val;
    }

    public void generate() {
        this.result = (int) val;
    }

}
