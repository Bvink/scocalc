package wildtornado.scocalc.strategies;

import wildtornado.scocalc.objects.DataInput;

public class LinesOfCodeCalculator extends BaseCalculator {

    private double lineVal;
    private double lineComp;

    public LinesOfCodeCalculator(DataInput dp, DataInput comp) {
        this.lineVal = dp.getLinesOfCode();
        this.lineComp = comp.getLinesOfCode();
    }

    public void generate() {
        if (lineVal != lineComp) {
            this.result = lineVal > lineComp ? (int) (Math.abs(lineVal - lineComp) * 20) : (int) Math.abs(lineVal - lineComp) * 10;
        }
    }

}