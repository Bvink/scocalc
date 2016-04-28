package wildtornado.scocalc.companies;

import wildtornado.scocalc.objects.DataInput;

public class GenericCompany extends BaseCompany {

    private final int metricAmount = 7;

    public GenericCompany(DataInput dp) {
        this.dp = dp;
    }

    public int generateScore() {
        this.score += CalculateCodeComplexity(dp.getCodeComplexity());
        this.score += CalculateCodeDuplicationDensity(dp.getCodeDuplicationDensity());
        this.score += CalculateCodeViolationsDensity(dp.getCodeViolationsDensity());
        this.score += CalculateCommentsPercentage(dp.getCommentPercentage());
        this.score += CalculateLinesOfCode(dp.getLinesOfCode());
        this.score += CalculateTechnicalDebt(dp.getTechnicalDebt());
        this.score += CalculateTestCoverage(dp.getNumberOfTests());
        return this.score;
    }

}
