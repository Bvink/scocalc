package wildtornado.scocalc.objects;

import wildtornado.scocalc.strategies.*;

public class Score {

    private int codeComplexityScore;
    private int codeDuplicationScore;
    private int codeViolationsScore;
    private int commentPercentageScore;
    private int commentLinesScore;
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

    public void calculateCodeDuplicationScore(double codeDuplicationScore, double codeDuplicationComparison) {
        Calculator calc = new CodeDuplicationDensityCalculator(codeDuplicationScore, codeDuplicationComparison);
        this.codeDuplicationScore = calc.run();
    }

    public int getCodeDuplicationScore() {
        return codeDuplicationScore;
    }

    public void calculateCodeViolationsScore(double codeViolationsScore, double codeViolationsComparison) {
        Calculator calc = new CodeViolationsDensityCalculator(codeViolationsScore, codeViolationsComparison);
        this.codeViolationsScore = calc.run();
    }

    public int getCodeViolationsScore() {
        return codeViolationsScore;
    }

    public void calculateCommentPercentageScore(double commentPercentageScore, double commentPercentageComparison, double commentLinesScore, double commentLinesComparison) {
        Calculator calc = new CommentPercentageCalculator(commentPercentageScore, commentPercentageComparison, commentLinesScore, commentLinesComparison);
        this.commentPercentageScore = calc.run();
    }

    public int getCommentPercentageScore() {
        return commentPercentageScore;
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

    public void calculateTestCoverageScore(double testCoverageScore, double testCoverageComparison) {
        Calculator calc = new TestCoverageCalculator(testCoverageScore, testCoverageComparison);
        this.testCoverageScore = calc.run();
    }

    public int getTestCoverageScore() {
        return testCoverageScore;
    }
}
