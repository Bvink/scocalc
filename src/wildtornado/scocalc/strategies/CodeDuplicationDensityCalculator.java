package wildtornado.scocalc.strategies;

public class CodeDuplicationDensityCalculator extends BaseCalculator {

    public CodeDuplicationDensityCalculator(double val, double comp) {
        this.val = val;
        this.comp = comp;
    }

    public void generate() {
        this.result = (int) val;
    }

}
