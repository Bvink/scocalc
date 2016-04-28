package wildtornado.scocalc.companies;

import wildtornado.scocalc.objects.DataInput;

public class JenkyCompany extends BaseCompany {

    private final int metricAmount = 5;

    public JenkyCompany(DataInput dp) {
        this.dp = dp;
    }

    public int generateScore() {
        this.score += CalculateCodeComplexity(dp.getCodeComplexity());
        this.score += CalculateCodeDuplicationDensity(dp.getCodeDuplicationDensity());
        this.score += CalculateCodeViolationsDensity(dp.getCodeViolationsDensity());
        this.score += CalculateCommentsPercentage(dp.getCommentPercentage());
        this.score += CalculateLinesOfCode(dp.getLinesOfCode());
        return this.score;
    }
}
