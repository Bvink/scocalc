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

    public void calculateCodeDuplication() {
        Calculator calc = new CodeDuplicationCalculator(dp, comp);
        score.setCodeDuplicationScore(calc.run());
    }

    public void calculateCodeViolations() {
        Calculator calc = new CodeViolationsCalculator(dp, comp);
        score.setCodeViolationsScore(calc.run());
    }

    public void calculateComments() {
        Calculator calc = new CommentCalculator(dp, comp);
        score.setCommentScore(calc.run());
    }

    public void calculateLinesOfCode() {
        Calculator calc = new LinesOfCodeCalculator(dp, comp);
        score.setLinesOfCodeScore(calc.run());
    }

    public void calculateTechnicalDebt() {
        Calculator calc = new TechnicalDebtCalculator(dp, comp);
        score.setTechnicalDebtScore(calc.run());
    }

    public void calculateTestCoverage() {
        Calculator calc = new TestCoverageCalculator(dp, comp);
        score.setTestCoverageScore(calc.run());
    }

    private void calculateAverageScore(int metricAmount) {
        int val = score.getTotalScore() / metricAmount;
        score.setAverageScore(val);
    }

}
