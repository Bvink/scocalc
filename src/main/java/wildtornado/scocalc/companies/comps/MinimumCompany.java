package wildtornado.scocalc.companies.comps;

import wildtornado.scocalc.companies.BaseCompany;
import wildtornado.scocalc.objects.DataInput;
import wildtornado.scocalc.objects.Score;

public class MinimumCompany extends BaseCompany {

    private static final int METRIC_AMOUNT = 1;
    private static final int COIN_DIVIDER = 100;

    public MinimumCompany(DataInput dp, DataInput comparison) {
        this.dp = dp;
        this.comp = comparison;
    }

    @Override
    public Score generateScore() {
        calculateLinesOfCode();
        calculateAverageScore(METRIC_AMOUNT);
        calculateCoins(COIN_DIVIDER);
        return score;
    }
}
