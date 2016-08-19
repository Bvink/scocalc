package wildtornado.scocalc.companycalculators;

import wildtornado.scocalc.calculators.Calculator;
import wildtornado.scocalc.calculators.CalculatorFactory;
import wildtornado.scocalc.constants.Constants;
import wildtornado.scocalc.objects.DataInput;
import wildtornado.scocalc.objects.Score;

public abstract class BaseCompanyCalculations implements CompanyCalculations {

    protected DataInput dp;
    protected DataInput comp;
    protected Score score = new Score();
    protected final CalculatorFactory CALCULATOR_FACTORY = new CalculatorFactory();

    @Override
    public void calculateCodeDuplication() {
        Calculator calc = obtainCalculator(Constants.CODE_DUPLICATION_CALCULATOR);
        score.setCodeDuplicationScore(calc.generate(dp, comp));
    }

    @Override
    public void calculateCodeViolations() {
        Calculator calc = obtainCalculator(Constants.CODE_VIOLATIONS_CALCULATOR);
        score.setCodeViolationsScore(calc.generate(dp, comp));
    }

    @Override
    public void calculateComments() {
        Calculator calc = obtainCalculator(Constants.COMMENT_CALCULATOR);
        score.setCommentScore(calc.generate(dp, comp));
    }

    @Override
    public void calculateLinesOfCode() {
        Calculator calc = obtainCalculator(Constants.LINES_OF_CODE_CALCULATOR);
        score.setLinesOfCodeScore(calc.generate(dp, comp));
    }

    @Override
    public void calculateTechnicalDebt() {
        Calculator calc = obtainCalculator(Constants.TECHNICAL_DEBT_CALCULATOR);
        score.setTechnicalDebtScore(calc.generate(dp, comp));
    }

    @Override
    public void calculateTestCoverage() {
        Calculator calc = obtainCalculator(Constants.TEST_COVERAGE_CALCULATOR);
        score.setTestCoverageScore(calc.generate(dp, comp));
    }

    @Override
    public void calculateAverageScore(int metricAmount) {
        int val = score.getTotalScore() / metricAmount;
        score.setAverageScore(val);
    }

    @Override
    public void calculateCoins(int coinDivider) {
        int val = (int) Math.floor(score.getAverageScore() / coinDivider);
        score.setCoinsEarned(val);
    }

    private Calculator obtainCalculator(String s) {
        return CALCULATOR_FACTORY.newInstance(s);
    }

}
