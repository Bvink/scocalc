package wildtornado.scocalc.strategies;

public class LinesOfCodeCalculator extends BaseCalculator {

    public void generate() {
        this.result = (int) Math.floor(val);
    }

}