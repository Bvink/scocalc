package wildtornado.scocalc.objects;

import wildtornado.scocalc.strategies.*;

public class Score {

    private int codeComplexityScore;
    private int codeDuplicationScore;
    private int codeViolationsScore;
    private int commentScore;
    private int linesOfCodeScore;
    private int technicalDebtScore;
    private int testCoverageScore;

    public void calculateCodeComplexityScore(double codeComplexityScore, double codeComplexityComparison) {
        Calculator calc = new CodeComplexityCalculator(codeComplexityScore, codeComplexityComparison);
        this.codeComplexityScore = calc.run();
    }

    public int getCodeComplexityScore() {
        return codeComplexityScore;
    }

    public void calculateCodeDuplicationScore(double codeDuplicationScore, double codeDuplicationComparison, double codeDuplicationDensity) {
        Calculator calc = new CodeDuplicationCalculator(codeDuplicationScore, codeDuplicationComparison, codeDuplicationDensity);
        this.codeDuplicationScore = calc.run();
    }

    public int getCodeDuplicationScore() {
        return codeDuplicationScore;
    }

    public void calculateCodeViolationsScore(double codeViolationsScore, double codeViolationsComparison) {
        Calculator calc = new CodeViolationsCalculator(codeViolationsScore, codeViolationsComparison);
        this.codeViolationsScore = calc.run();
    }

    public int getCodeViolationsScore() {
        return codeViolationsScore;
    }

    public void calculateCommentPercentageScore(double commentPercentageScore, double commentLinesScore, double commentLinesComparison, double commentedOutCodeLines, double commentedOutCodeLinesComparison) {
        Calculator calc = new CommentCalculator(commentPercentageScore, commentLinesScore, commentLinesComparison, commentedOutCodeLines, commentedOutCodeLinesComparison);
        this.commentScore = calc.run();
    }

    public int getCommentScore() {
        return commentScore;
    }

    public void calculateLinesOfCodeScore(double linesOfCodeScore, double linesOfCodeComparison) {
        Calculator calc = new LinesOfCodeCalculator(linesOfCodeScore, linesOfCodeComparison);
        this.linesOfCodeScore = calc.run();
    }

    public int getLinesOfCodeScore() {
        return linesOfCodeScore;
    }

    public void calculateTechnicalDebtScore(double technicalDebtScore, double technicalDebtComparison) {
        Calculator calc = new TechnicalDebtCalculator(technicalDebtScore, technicalDebtComparison);
        this.technicalDebtScore = calc.run();
    }

    public int getTechnicalDebtScore() {
        return technicalDebtScore;
    }

    public void calculateTestCoverageScore(double testCoverage, double testAmountScore, double testAmountComparison, double testErrorScore, double testErrorComparison, double testFailureScore, double testFailureComparison) {
        Calculator calc = new TestCoverageCalculator(testCoverage, testAmountScore, testAmountComparison, testErrorScore, testErrorComparison, testFailureScore, testFailureComparison);
        this.testCoverageScore = calc.run();
    }

    public int getTestCoverageScore() {
        return testCoverageScore;
    }
}
