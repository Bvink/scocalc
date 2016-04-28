package wildtornado.scocalc.companies;

import wildtornado.scocalc.objects.DataInput;
import wildtornado.scocalc.strategies.*;

public abstract class BaseCompany implements Company {

    protected int score = 0;
    protected DataInput dp;

    public int generateScore() {
        return 0;
    }

    public int CalculateCodeComplexity(int val) {
        Calculator calc = new CodeComplexityCalculator(val);
        return calc.run();
    }

    public int CalculateCodeDuplicationDensity(int val) {
        Calculator calc = new CodeDuplicationDensityCalculator(val);
        return calc.run();
    }

    public int CalculateCodeViolationsDensity(int val) {
        Calculator calc = new CodeViolationsDensityCalculator(val);
        return calc.run();
    }

    public int CalculateCommentsPercentage(int val) {
        Calculator calc = new CommentPercentageCalculator(val);
        return calc.run();
    }

    public int CalculateLinesOfCode(int val) {
        Calculator calc = new LinesOfCodeCalculator(val);
        return calc.run();
    }

    public int CalculateTechnicalDebt(int val) {
        Calculator calc = new TechnicalDebtCalculator(val);
        return calc.run();
    }

    public int CalculateTestCoverage(int val) {
        Calculator calc = new TestCoverageCalculator(val);
        return calc.run();
    }

}
