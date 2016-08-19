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
    private int coinsEarned;

    public int getCodeDuplicationScore() {
        return codeDuplicationScore;
    }

    public void setCodeDuplicationScore(int codeDuplicationScore) {
        this.codeDuplicationScore = updateScore(this.codeDuplicationScore, codeDuplicationScore);
    }

    public int getCodeViolationsScore() {
        return codeViolationsScore;
    }

    public void setCodeViolationsScore(int codeViolationsScore) {
        this.codeViolationsScore = updateScore(this.codeViolationsScore, codeViolationsScore);
    }

    public int getCommentScore() {
        return commentScore;
    }

    public void setCommentScore(int commentScore) {
        this.commentScore = updateScore(this.commentScore, commentScore);
    }

    public int getLinesOfCodeScore() {
        return linesOfCodeScore;
    }

    public void setLinesOfCodeScore(int linesOfCodeScore) {
        this.linesOfCodeScore = updateScore(this.linesOfCodeScore, linesOfCodeScore);
    }

    public int getTechnicalDebtScore() {
        return technicalDebtScore;
    }

    public void setTechnicalDebtScore(int technicalDebtScore) {
        this.technicalDebtScore = updateScore(this.technicalDebtScore, technicalDebtScore);
    }

    public int getTestCoverageScore() {
        return testCoverageScore;
    }

    public void setTestCoverageScore(int testCoverageScore) {
        this.testCoverageScore = updateScore(this.testCoverageScore, testCoverageScore);
    }

    public int getTotalScore() {
        return totalScore;
    }

    public int getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
        this.coinsEarned = (int) Math.floor(averageScore / 100);
    }

    public int getCoinsEarned() {
        return coinsEarned;
    }

    public void setCoinsEarned(int coinsEarned) {
        this.coinsEarned = coinsEarned;
    }

    private int updateScore(int originalScore, int newScore) {
        this.totalScore -= originalScore;
        this.totalScore += newScore;
        return newScore;
    }
}
