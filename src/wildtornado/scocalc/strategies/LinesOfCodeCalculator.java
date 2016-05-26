package wildtornado.scocalc.strategies;

import wildtornado.scocalc.objects.DataInput;

public class LinesOfCodeCalculator extends BaseCalculator {

    private double lineVal;
    private double lineComp;

    public LinesOfCodeCalculator(DataInput dp, DataInput comp) {
        this.lineVal = dp.getLinesOfCode();
        this.lineComp = comp.getLinesOfCode();

        this.score = 20;
    }

    public void generate() {
        if (lineVal != lineComp) {
            this.result = lineVal > lineComp ? (int) (Math.abs(lineVal - lineComp) * score) : (int) Math.abs(lineVal - lineComp) * (score / 2);
            putScoreWithinBounds(this.result);
        }
    }

}