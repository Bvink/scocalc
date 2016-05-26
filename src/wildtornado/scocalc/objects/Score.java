package wildtornado.scocalc.objects;

public class Score {

    private int codeDuplicationScore;
    private int codeViolationsScore;
    private int commentScore;
    private int linesOfCodeScore;
    private int technicalDebtScore;
    private int testCoverageScore;

    public int getCodeDuplicationScore() {
        return codeDuplicationScore;
    }

    public void setCodeDuplicationScore(int codeDuplicationScore) {
        this.codeDuplicationScore = codeDuplicationScore;
    }

    public int getCodeViolationsScore() {
        return codeViolationsScore;
    }

    public void setCodeViolationsScore(int codeViolationsScore) {
        this.codeViolationsScore = codeViolationsScore;
    }

    public int getCommentScore() {
        return commentScore;
    }

    public void setCommentScore(int commentScore) {
        this.commentScore = commentScore;
    }

    public int getLinesOfCodeScore() {
        return linesOfCodeScore;
    }

    public void setLinesOfCodeScore(int linesOfCodeScore) {
        this.linesOfCodeScore = linesOfCodeScore;
    }

    public int getTechnicalDebtScore() {
        return technicalDebtScore;
    }

    public void setTechnicalDebtScore(int technicalDebtScore) {
        this.technicalDebtScore = technicalDebtScore;
    }

    public int getTestCoverageScore() {
        return testCoverageScore;
    }

    public void setTestCoverageScore(int testCoverageScore) {
        this.testCoverageScore = testCoverageScore;
    }
}
