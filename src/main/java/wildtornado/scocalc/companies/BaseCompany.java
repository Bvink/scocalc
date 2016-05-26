package wildtornado.scocalc.companies;

import wildtornado.scocalc.objects.DataInput;
import wildtornado.scocalc.objects.Score;
import wildtornado.scocalc.calculators.*;

public abstract class BaseCompany implements Company {

    protected DataInput dp;
    protected DataInput comp;
    protected Score score = new Score();

    @Override
    public Score generateScore() {
        return new Score();
    }

    @Override
    public void calculateCodeDuplication() {
        Calculator calc = new CodeDuplicationCalculator(dp, comp);
        score.setCodeDuplicationScore(calc.run());
    }

    @Override
    public void calculateCodeViolations() {
        Calculator calc = new CodeViolationsCalculator(dp, comp);
        score.setCodeViolationsScore(calc.run());
    }

    @Override
    public void calculateComments() {
        Calculator calc = new CommentCalculator(dp, comp);
        score.setCommentScore(calc.run());
    }

    @Override
    public void calculateLinesOfCode() {
        Calculator calc = new LinesOfCodeCalculator(dp, comp);
        score.setLinesOfCodeScore(calc.run());
    }

    @Override
    public void calculateTechnicalDebt() {
        Calculator calc = new TechnicalDebtCalculator(dp, comp);
        score.setTechnicalDebtScore(calc.run());
    }

    @Override
    public void calculateTestCoverage() {
        Calculator calc = new TestCoverageCalculator(dp, comp);
        score.setTestCoverageScore(calc.run());
    }

    @Override
    public void calculateAverageScore(int metricAmount) {
        int val = score.getTotalScore() / metricAmount;
        score.setAverageScore(val);
    }

}
