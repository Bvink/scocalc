package wildtornado.scocalc.strategies;

public class CodeViolationsDensityCalculator extends BaseCalculator {

    public void generate() {
        this.result = score +  (int) Math.floor(val);
    }

}