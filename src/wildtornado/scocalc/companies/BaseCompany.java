package wildtornado.scocalc.companies;

import wildtornado.scocalc.objects.DataInput;
import wildtornado.scocalc.objects.Score;

public abstract class BaseCompany implements Company {

    protected DataInput dp;
    protected Score score = new Score();

    public Score generateScore() {
        return new Score();
    }

    public void CalculateCodeComplexity() {
        score.calculateCodeComplexityScore(dp.getCodeComplexity());
        score.addTotalScore(score.getCodeComplexityScore());
    }

    public void CalculateCodeDuplicationDensity() {
        score.calculateCodeDuplicationScore(dp.getCodeDuplicationDensity());
        score.addTotalScore(score.getCodeDuplicationScore());
    }

    public void CalculateCodeViolationsDensity() {
        score.calculateCodeViolationsScore(dp.getCodeViolationsDensity());
        score.addTotalScore(score.getCodeViolationsScore());
    }

    public void CalculateCommentsPercentage() {
        score.calculateCommentPercentageScore(dp.getCommentPercentage());
        score.addTotalScore(score.getCommentPercentageScore());
    }

    public void CalculateLinesOfCode() {
        score.calculateLinesOfCodeScore(dp.getLinesOfCode());
        score.addTotalScore(score.getLinesOfCodeScore());
    }

    public void CalculateTechnicalDebt() {
        score.calculateTechnicalDebtScore(dp.getTechnicalDebt());
        score.addTotalScore(score.getTechnicalDebtScore());
    }

    public void CalculateTestCoverage() {
        score.calculateTestCoverageScore(dp.getNumberOfTests());
        score.addTotalScore(score.getTestCoverageScore());
    }

}
