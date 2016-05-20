package wildtornado.scocalc.companies;

import wildtornado.scocalc.objects.DataInput;
import wildtornado.scocalc.objects.Score;

public abstract class BaseCompany implements Company {

    protected DataInput dp;
    protected DataInput comparison;
    protected Score score = new Score();

    public Score generateScore() {
        return new Score();
    }

    public void CalculateCodeComplexity() {
        score.calculateCodeComplexityScore(dp.getCodeComplexity(), comparison.getCodeComplexity());
    }

    public void CalculateCodeDuplicationDensity() {
        score.calculateCodeDuplicationScore(dp.getCodeDuplication(), comparison.getCodeDuplication(), dp.getCodeDuplicationDensity());
    }

    public void CalculateCodeViolationsDensity() {
        score.calculateCodeViolationsScore(dp.getCodeViolations(), comparison.getCodeViolations());
    }

    public void CalculateCommentsPercentage() {
        score.calculateCommentPercentageScore(dp.getCommentPercentage(), dp.getCommentLines(), comparison.getCommentLines(), dp.getCommentedOutCodeLines(), comparison.getCommentedOutCodeLines());
    }

    public void CalculateLinesOfCode() {
        score.calculateLinesOfCodeScore(dp.getLinesOfCode(), comparison.getLinesOfCode());
    }

    public void CalculateTechnicalDebt() {
        score.calculateTechnicalDebtScore(dp.getTechnicalDebt(), comparison.getTechnicalDebt());
    }

    public void CalculateTestCoverage() {
        score.calculateTestCoverageScore(dp.getTestCoverage(), dp.getNumberOfTests(), comparison.getNumberOfTests(), dp.getTestErrors(), comparison.getTestErrors(), dp.getTestFailures(), comparison.getTestFailures());
    }

}
