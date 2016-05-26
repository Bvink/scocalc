package wildtornado.scocalc.strategies;

import wildtornado.scocalc.objects.DataInput;

public class LinesOfCodeCalculator extends BaseCalculator {

    private double lineVal;
    private double lineComp;

    public LinesOfCodeCalculator(DataInput dp, DataInput comp) {
        this.lineVal = dp.getLinesOfCode();
        this.lineComp = comp.getLinesOfCode();

        this.score = 10;
    }

    @Override
    public void generate() {
        if (!(Math.abs(lineVal - lineComp) < 0.00000001)) {
            this.result = lineVal > lineComp ? (int) (Math.abs(lineVal - lineComp) * score) : (int) Math.abs(lineVal - lineComp) * (score / 2);
            putScoreWithinBounds(this.result);
        }
    }

}