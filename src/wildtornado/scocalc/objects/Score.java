package wildtornado.scocalc.objects;

import wildtornado.scocalc.strategies.*;

public class Score {

    private int metricsEnabledAmount;

    private int codeComplexityScore;
    private int codeDuplicationScore;
    private int codeViolationsScore;
    private int commentPercentageScore;
    private int linesOfCodeScore;
    private int technicalDebtScore;
    private int testCoverageScore;
    private int totalScore;
    private int finalScore;

    public void setMetricsEnabledAmount(int metricsEnabledAmount) {
        this.metricsEnabledAmount = metricsEnabledAmount;
    }

    public int getMetricsEnabledAmount() {
        return metricsEnabledAmount;
    }

    public int getCodeComplexityScore() {
        return codeComplexityScore;
    }

    public void calculateCodeComplexityScore(double codeComplexityScore) {
        Calculator calc = new CodeComplexityCalculator(codeComplexityScore);
        this.codeComplexityScore = calc.run();
    }

    public int getCodeDuplicationScore() {
        return codeDuplicationScore;
    }

    public void calculateCodeDuplicationScore(double codeDuplicationScore) {
        Calculator calc = new CodeDuplicationDensityCalculator(codeDuplicationScore);
        this.codeDuplicationScore = calc.run();
    }

    public int getCodeViolationsScore() {
        return codeViolationsScore;
    }

    public void calculateCodeViolationsScore(double codeViolationsScore) {
        Calculator calc = new CodeViolationsDensityCalculator(codeViolationsScore);
        this.codeViolationsScore = calc.run();
    }

    public int getCommentPercentageScore() {
        return commentPercentageScore;
    }

    public void calculateCommentPercentageScore(double commentPercentageScore) {
        Calculator calc = new CommentPercentageCalculator(commentPercentageScore);
        this.commentPercentageScore = calc.run();
    }

    public int getLinesOfCodeScore() {
        return linesOfCodeScore;
    }

    public void calculateLinesOfCodeScore(double linesOfCodeScore) {
        Calculator calc = new LinesOfCodeCalculator(linesOfCodeScore);
        this.linesOfCodeScore = calc.run();
    }

    public int getTechnicalDebtScore() {
        return technicalDebtScore;
    }

    public void calculateTechnicalDebtScore(double technicalDebtScore) {
        Calculator calc = new TechnicalDebtCalculator(technicalDebtScore);
        this.technicalDebtScore = calc.run();
    }

    public int getTestCoverageScore() {
        return testCoverageScore;
    }

    public void calculateTestCoverageScore(double testCoverageScore) {
        Calculator calc = new TestCoverageCalculator(testCoverageScore);
        this.testCoverageScore = calc.run();
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void addTotalScore(int score) {
        this.totalScore += score;
    }

    public int getFinalScore() {
        return finalScore;
    }

    public void calculateFinalScore() {
        this.finalScore = this.totalScore / this.metricsEnabledAmount;
    }
}
