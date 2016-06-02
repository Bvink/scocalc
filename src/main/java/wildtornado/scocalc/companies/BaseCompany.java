package wildtornado.scocalc.companies;

import wildtornado.scocalc.calculators.*;
import wildtornado.scocalc.calculators.calcs.*;
import wildtornado.scocalc.objects.DataInput;
import wildtornado.scocalc.objects.Score;

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
        Calculator calc = new CodeDuplicationCalculator();
        score.setCodeDuplicationScore(calc.generate(dp, comp));
    }

    @Override
    public void calculateCodeViolations() {
        Calculator calc = new CodeViolationsCalculator();
        score.setCodeViolationsScore(calc.generate(dp, comp));
    }

    @Override
    public void calculateComments() {
        Calculator calc = new CommentCalculator();
        score.setCommentScore(calc.generate(dp, comp));
    }

    @Override
    public void calculateLinesOfCode() {
        Calculator calc = new LinesOfCodeCalculator();
        score.setLinesOfCodeScore(calc.generate(dp, comp));
    }

    @Override
    public void calculateTechnicalDebt() {
        Calculator calc = new TechnicalDebtCalculator();
        score.setTechnicalDebtScore(calc.generate(dp, comp));
    }

    @Override
    public void calculateTestCoverage() {
        Calculator calc = new TestCoverageCalculator();
        score.setTestCoverageScore(calc.generate(dp, comp));
    }

    @Override
    public void calculateAverageScore(int metricAmount) {
        int val = score.getTotalScore() / metricAmount;
        score.setAverageScore(val);
    }

}
