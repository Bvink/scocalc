package wildtornado.scocalc.companies;

import wildtornado.scocalc.objects.DataInput;
import wildtornado.scocalc.objects.Score;

public class JenkyCompany extends BaseCompany {

    public JenkyCompany(DataInput dp, DataInput comparison) {
        this.dp = dp;
        this.comparison = comparison;
    }

    public Score generateScore() {
        CalculateCodeDuplicationDensity();
        CalculateCodeViolationsDensity();
        CalculateCommentsPercentage();
        CalculateLinesOfCode();
        return score;
    }
}
