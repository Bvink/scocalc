package wildtornado.scocalc.calculators.calcs;

import wildtornado.scocalc.calculators.BaseCalculator;
import wildtornado.scocalc.objects.DataInput;

public class LinesOfCodeCalculator extends BaseCalculator {


    public LinesOfCodeCalculator() {
        this.score = 10;
    }

    @Override
    public int generate(DataInput dp, DataInput comp) {

        int result = 0;

        if (!(Math.abs(dp.getLinesOfCode() - comp.getLinesOfCode()) < 0.00000001)) {
            result = dp.getLinesOfCode() > comp.getLinesOfCode() ? (int) (Math.abs(dp.getLinesOfCode() - comp.getLinesOfCode()) * score) : (int) Math.abs(dp.getLinesOfCode() - comp.getLinesOfCode()) * (score / 2);
            result = putScoreWithinBounds(result);
        }
        return result;
    }

}