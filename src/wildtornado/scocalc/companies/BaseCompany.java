package wildtornado.scocalc.companies;

import wildtornado.scocalc.objects.DataInput;
import wildtornado.scocalc.objects.Score;
import wildtornado.scocalc.strategies.*;

public abstract class BaseCompany implements Company {

    protected DataInput dp;
    protected DataInput comp;
    protected Score score = new Score();

    public Score generateScore() {
        return new Score();
    }

    public void CalculateCodeDuplication() {
        Calculator calc = new CodeDuplicationCalculator(dp, comp);
        score.setCodeDuplicationScore(calc.run());
    }

    public void CalculateCodeViolations() {
        Calculator calc = new CodeViolationsCalculator(dp, comp);
        score.setCodeViolationsScore(calc.run());
    }

    public void CalculateComments() {
        Calculator calc = new CommentCalculator(dp, comp);
        score.setCommentScore(calc.run());
    }

    public void CalculateLinesOfCode() {
        Calculator calc = new LinesOfCodeCalculator(dp, comp);
        score.setLinesOfCodeScore(calc.run());
    }

    public void CalculateTechnicalDebt() {
        Calculator calc = new TechnicalDebtCalculator(dp, comp);
        score.setTechnicalDebtScore(calc.run());
    }

    public void CalculateTestCoverage() {
        Calculator calc = new TestCoverageCalculator(dp, comp);
        score.setTestCoverageScore(calc.run());
    }

}
