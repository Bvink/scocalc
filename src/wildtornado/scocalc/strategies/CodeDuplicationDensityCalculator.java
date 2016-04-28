package wildtornado.scocalc.strategies;

public class CodeDuplicationDensityCalculator extends BaseCalculator {

    public CodeDuplicationDensityCalculator(int val) {
        this.val = val;
    }

    public void generate() {
        this.result = score + val;
    }

}
