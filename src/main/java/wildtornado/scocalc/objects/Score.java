package wildtornado.scocalc.objects;

public class Score {

    private int codeDuplicationScore;
    private int codeViolationsScore;
    private int commentScore;
    private int linesOfCodeScore;
    private int technicalDebtScore;
    private int testCoverageScore;
    private int totalScore;
    private int averageScore;

    public int getCodeDuplicationScore() {
        return codeDuplicationScore;
    }

    public void setCodeDuplicationScore(int codeDuplicationScore) {
        this.totalScore -= this.codeDuplicationScore;
        this.codeDuplicationScore = codeDuplicationScore;
        this.totalScore += codeDuplicationScore;
    }

    public int getCodeViolationsScore() {
        return codeViolationsScore;
    }

    public void setCodeViolationsScore(int codeViolationsScore) {
        this.totalScore -= this.codeViolationsScore;
        this.codeViolationsScore = codeViolationsScore;
        this.totalScore += codeViolationsScore;
    }

    public int getCommentScore() {
        return commentScore;
    }

    public void setCommentScore(int commentScore) {
        this.totalScore -= this.commentScore;
        this.commentScore = commentScore;
        this.totalScore += commentScore;
    }

    public int getLinesOfCodeScore() {
        return linesOfCodeScore;
    }

    public void setLinesOfCodeScore(int linesOfCodeScore) {
        this.totalScore -= this.linesOfCodeScore;
        this.linesOfCodeScore = linesOfCodeScore;
        this.totalScore += linesOfCodeScore;
    }

    public int getTechnicalDebtScore() {
        return technicalDebtScore;
    }

    public void setTechnicalDebtScore(int technicalDebtScore) {
        this.totalScore -= this.technicalDebtScore;
        this.technicalDebtScore = technicalDebtScore;
        this.totalScore += technicalDebtScore;
    }

    public int getTestCoverageScore() {
        return testCoverageScore;
    }

    public void setTestCoverageScore(int testCoverageScore) {
        this.totalScore -= this.testCoverageScore;
        this.testCoverageScore = testCoverageScore;
        this.totalScore += testCoverageScore;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public int getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }

}
