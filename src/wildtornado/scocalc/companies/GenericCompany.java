package wildtornado.scocalc.companies;

import wildtornado.scocalc.objects.DataInput;
import wildtornado.scocalc.objects.Score;

public class GenericCompany extends BaseCompany {

    public GenericCompany(DataInput dp, DataInput comparison) {
        this.dp = dp;
        this.comparison = comparison;
    }

    public Score generateScore() {
        CalculateCodeComplexity();
        CalculateCodeDuplicationDensity();
        CalculateCodeViolationsDensity();
        CalculateCommentsPercentage();
        CalculateLinesOfCode();
        CalculateTechnicalDebt();
        CalculateTestCoverage();
        return score;
    }

}
