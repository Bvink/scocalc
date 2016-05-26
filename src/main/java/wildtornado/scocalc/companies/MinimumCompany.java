package wildtornado.scocalc.companies;

import wildtornado.scocalc.objects.DataInput;
import wildtornado.scocalc.objects.Score;

public class MinimumCompany extends BaseCompany {

    private static final int METRIC_AMOUNT = 1;

    public MinimumCompany(DataInput dp, DataInput comparison) {
        this.dp = dp;
        this.comp = comparison;
    }

    @Override
    public Score generateScore() {
        calculateLinesOfCode();
        calculateAverageScore(METRIC_AMOUNT);
        return score;
    }
}
