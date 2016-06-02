package wildtornado.scocalc.calculators.calcs;

import wildtornado.scocalc.calculators.BaseCalculator;
import wildtornado.scocalc.objects.DataInput;

public class TechnicalDebtCalculator extends BaseCalculator {

    public TechnicalDebtCalculator() {
        this.score = 5;
    }

    @Override
    public int generate(DataInput dp, DataInput comp) {

        int result = 0;

        if (!(Math.abs(dp.getTechnicalDebt() - comp.getTechnicalDebt()) < 0.00000001)) {
            result = dp.getTechnicalDebt() < comp.getTechnicalDebt() ? (int) (Math.abs(dp.getTechnicalDebt() - comp.getTechnicalDebt()) * score) : MIN_SCORE;
            result = putScoreWithinBounds(result);
        }
        return result;
    }

}