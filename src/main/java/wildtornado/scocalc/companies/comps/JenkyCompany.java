package wildtornado.scocalc.companies.comps;

import wildtornado.scocalc.companies.BaseCompany;
import wildtornado.scocalc.objects.DataInput;
import wildtornado.scocalc.objects.Score;

public class JenkyCompany extends BaseCompany {

    private static final int METRIC_AMOUNT = 4;
    private static final int COIN_DIVIDER = 100;

    public JenkyCompany(DataInput dp, DataInput comparison) {
        this.dp = dp;
        this.comp = comparison;
    }

    @Override
    public Score generateScore() {
        calculateCodeDuplication();
        calculateCodeViolations();
        calculateComments();
        calculateLinesOfCode();
        calculateAverageScore(METRIC_AMOUNT);
        calculateCoins(COIN_DIVIDER);
        return score;
    }
}
