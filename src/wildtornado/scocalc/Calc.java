package wildtornado.scocalc;

import wildtornado.scocalc.strategies.*;

public class Calc {

    private int score;

    //Code complexity is a value of minimum 1 that goes up, the larger it is, the worse.
    //The format is XXX.00
    private String codeComplexity;

    //Code duplication is a percentage of how much of the code is duplicate.
    //The format is XXX.00
    private String codeDuplicationDensity;

    //Code duplication is a percentage of how much of the code is duplicate.
    //The format is XXX.00
    private String codeViolationsDensity;

    //The amount of unit tests performed, each one gives bonus points.
    //The format is XXX.00
    private String numberOfTests;

    //The amount of minutes required to fix the code, high amount of minutes = bad.
    //The format is XXX.00
    private String technicalDebt;

    //The percentage of comments vs lines of code.
    //The format is XXX.00
    private String commentPercentage;

    //The amount of lines of code.
    //The formati is XXX.00
    private String linesOfCode;

    public Calc(String args[]) {
        if(args.length == 7) {
            this.score = 1000;
            this.codeComplexity = args[0];
            this.codeDuplicationDensity = args[1];
            this.codeViolationsDensity = args[2];
            this.numberOfTests = args[3];
            this.technicalDebt = args[4];
            this.commentPercentage = args[5];
            this.linesOfCode = args[6];
        }
    }

    public int generateScore() {
        this.score = calculate(new CodeComplexityCalculator(), this.codeComplexity, score);
        this.score = calculate(new CodeDuplicationDensityCalculator(), this.codeDuplicationDensity, score);
        this.score = calculate(new CodeViolationsDensityCalculator(), this.codeViolationsDensity, score);
        this.score = calculate(new TestCoverageCalculator(), this.numberOfTests, score);
        this.score = calculate(new TechnicalDebtCalculator(), this.technicalDebt, score);
        this.score = calculate(new CommentPercentageCalculator(), this.commentPercentage, score);
        this.score = calculate(new LinesOfCodeCalculator(), this.linesOfCode, score);
        return score;
    }

    private int calculate(Calculator calc, String s, int i) {
        calc.setVal(s, i);
        calc.generate();
        return calc.getResult();
    }
}