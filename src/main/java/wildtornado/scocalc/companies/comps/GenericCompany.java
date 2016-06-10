package wildtornado.scocalc.companies.comps;

import wildtornado.scocalc.companies.BaseCompany;
import wildtornado.scocalc.objects.DataInput;
import wildtornado.scocalc.objects.Score;

public class GenericCompany extends BaseCompany {

    private static final int METRIC_AMOUNT = 6;
    private static final int COIN_DIVIDER = 100;

    public GenericCompany(DataInput dp, DataInput comparison) {
        this.dp = dp;
        this.comp = comparison;
    }

    @Override
    public Score generateScore() {
        calculateCodeDuplication();
        calculateCodeViolations();
        calculateComments();
        calculateLinesOfCode();
        calculateTechnicalDebt();
        calculateTestCoverage();
        calculateAverageScore(METRIC_AMOUNT);
        calculateCoins(COIN_DIVIDER);
        return score;
    }

}
