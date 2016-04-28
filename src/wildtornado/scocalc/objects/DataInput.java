package wildtornado.scocalc.objects;

public class DataInput {

    //The companyID identifies which company is attempting to generate a score.
    private int companyID;

    //Code complexity is a value of minimum 1 that goes up, the larger it is, the worse.
    //The format is XXX.00
    private int codeComplexity;

    //Code duplication is a percentage of how much of the code is duplicate.
    //The format is XXX.00
    private int codeDuplicationDensity;

    //Code duplication is a percentage of how much of the code is duplicate.
    //The format is XXX.00
    private int codeViolationsDensity;

    //The amount of unit tests performed, each one gives bonus points.
    //The format is XXX.00
    private int numberOfTests;

    //The amount of minutes required to fix the code, high amount of minutes = bad.
    //The format is XXX.00
    private int technicalDebt;

    //The percentage of comments vs lines of code.
    //The format is XXX.00
    private int commentPercentage;

    //The amount of lines of code.
    //The formati is XXX.00
    private int linesOfCode;

    public int getCompanyID() {
        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    public int getCodeComplexity() {
        return codeComplexity;
    }

    public void setCodeComplexity(int codeComplexity) {
        this.codeComplexity = codeComplexity;
    }

    public int getCodeDuplicationDensity() {
        return codeDuplicationDensity;
    }

    public void setCodeDuplicationDensity(int codeDuplicationDensity) {
        this.codeDuplicationDensity = codeDuplicationDensity;
    }

    public int getCodeViolationsDensity() {
        return codeViolationsDensity;
    }

    public void setCodeViolationsDensity(int codeViolationsDensity) {
        this.codeViolationsDensity = codeViolationsDensity;
    }

    public int getNumberOfTests() {
        return numberOfTests;
    }

    public void setNumberOfTests(int numberOfTests) {
        this.numberOfTests = numberOfTests;
    }

    public int getTechnicalDebt() {
        return technicalDebt;
    }

    public void setTechnicalDebt(int technicalDebt) {
        this.technicalDebt = technicalDebt;
    }

    public int getCommentPercentage() {
        return commentPercentage;
    }

    public void setCommentPercentage(int commentPercentage) {
        this.commentPercentage = commentPercentage;
    }

    public int getLinesOfCode() {
        return linesOfCode;
    }

    public void setLinesOfCode(int linesOfCode) {
        this.linesOfCode = linesOfCode;
    }
}
