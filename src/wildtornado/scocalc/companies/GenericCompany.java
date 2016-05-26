package wildtornado.scocalc.companies;

import wildtornado.scocalc.objects.DataInput;
import wildtornado.scocalc.objects.Score;

public class GenericCompany extends BaseCompany {

    public GenericCompany(DataInput dp, DataInput comparison) {
        this.dp = dp;
        this.comp = comparison;
    }

    public Score generateScore() {
        CalculateCodeDuplication();
        CalculateCodeViolations();
        CalculateComments();
        CalculateLinesOfCode();
        CalculateTechnicalDebt();
        CalculateTestCoverage();
        return score;
    }

}
