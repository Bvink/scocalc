package wildtornado.scocalc.companies;

import wildtornado.scocalc.objects.DataInput;
import wildtornado.scocalc.objects.Score;

public class GenericCompany extends BaseCompany {

    public GenericCompany(DataInput dp) {
        this.dp = dp;
    }

    public Score generateScore() {
        score.setMetricsEnabledAmount(7);

        CalculateCodeComplexity();
        CalculateCodeDuplicationDensity();
        CalculateCodeViolationsDensity();
        CalculateCommentsPercentage();
        CalculateLinesOfCode();
        CalculateTechnicalDebt();
        CalculateTestCoverage();
        score.setFinalScore(score.getTotalScore() / score.getMetricsEnabledAmount());
        return score;
    }

}
