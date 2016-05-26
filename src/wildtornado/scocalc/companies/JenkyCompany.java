package wildtornado.scocalc.companies;

import wildtornado.scocalc.objects.DataInput;
import wildtornado.scocalc.objects.Score;

public class JenkyCompany extends BaseCompany {

    protected final int metricAmount = 4;

    public JenkyCompany(DataInput dp, DataInput comparison) {
        this.dp = dp;
        this.comp = comparison;
    }

    public Score generateScore() {
        calculateCodeDuplication();
        calculateCodeViolations();
        calculateComments();
        calculateLinesOfCode();
        calculateAverageScore(metricAmount);
        return score;
    }
}
