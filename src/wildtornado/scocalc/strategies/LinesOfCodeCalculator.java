package wildtornado.scocalc.strategies;

public class LinesOfCodeCalculator extends BaseCalculator {

    public void generate() {
        this.result = score +  (int) Math.floor(val);
    }

}