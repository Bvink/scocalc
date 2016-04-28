package wildtornado.scocalc.companies;

import wildtornado.scocalc.objects.DataInput;
import wildtornado.scocalc.objects.Score;
import wildtornado.scocalc.strategies.*;

public abstract class BaseCompany implements Company {

    protected DataInput dp;
    protected Score score = new Score();

    public Score generateScore() {
        return new Score();
    }

    public void CalculateCodeComplexity() {
        score.setCodeComplexityScore(dp.getCodeComplexity());
        score.addTotalScore(score.getCodeComplexityScore());
    }

    public void CalculateCodeDuplicationDensity() {
        score.setCodeDuplicationScore(dp.getCodeDuplicationDensity());
        score.addTotalScore(score.getCodeDuplicationScore());
    }

    public void CalculateCodeViolationsDensity() {
        score.setCodeViolationsScore(dp.getCodeViolationsDensity());
        score.addTotalScore(score.getCodeViolationsScore());
    }

    public void CalculateCommentsPercentage() {
        score.setCommentPercentageScore(dp.getCommentPercentage());
        score.addTotalScore(score.getCommentPercentageScore());
    }

    public void CalculateLinesOfCode() {
        score.setLinesOfCodeScore(dp.getLinesOfCode());
        score.addTotalScore(score.getLinesOfCodeScore());
    }

    public void CalculateTechnicalDebt() {
        score.setTechnicalDebtScore(dp.getTechnicalDebt());
        score.addTotalScore(score.getTechnicalDebtScore());
    }

    public void CalculateTestCoverage() {
        score.setTestCoverageScore(dp.getNumberOfTests());
        score.addTotalScore(score.getTestCoverageScore());
    }

}
