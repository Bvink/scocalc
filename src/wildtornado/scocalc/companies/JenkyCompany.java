package wildtornado.scocalc.companies;

import wildtornado.scocalc.objects.DataInput;
import wildtornado.scocalc.objects.Score;

public class JenkyCompany extends BaseCompany {

    public JenkyCompany(DataInput dp) {
        this.dp = dp;
    }

    public Score generateScore() {
        score.setMetricsEnabledAmount(5);

        CalculateCodeComplexity();
        CalculateCodeDuplicationDensity();
        CalculateCodeViolationsDensity();
        CalculateCommentsPercentage();
        CalculateLinesOfCode();
        score.calculateFinalScore();
        return score;
    }
}
