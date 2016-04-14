package wildtornado.scocalc.strategies;

public class CodeDuplicationDensityCalculator extends BaseCalculator {

    public void generate() {
        this.result = score +  (int) Math.floor(val);
    }

}
