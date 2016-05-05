package wildtornado.scocalc.objects;

public class DataInput {

    //The companyID identifies which company is attempting to generate a score.
    private int companyID;

    //Code complexity is a value of minimum 1 that goes up, the larger it is, the worse.
    //The format is XXX.00
    private double codeComplexity;

    //Code duplication is a percentage of how much of the code is duplicate.
    //The format is XXX.00
    private double codeDuplicationDensity;

    //Code duplication is a percentage of how much of the code is duplicate.
    //The format is XXX.00
    private double codeViolationsDensity;

    //The amount of unit tests performed, each one gives bonus points.
    //The format is XXX.00
    private double numberOfTests;

    //The amount of minutes required to fix the code, high amount of minutes = bad.
    //The format is XXX.00
    private double technicalDebt;

    //The percentage of comments vs lines of code.
    //The format is XXX.00
    private double commentPercentage;

    //The amount of lines of code.
    //The formati is XXX.00
    private double linesOfCode;

    public int getCompanyID() {
        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    public double getCodeComplexity() {
        return codeComplexity;
    }

    public void setCodeComplexity(int codeComplexity) {
        this.codeComplexity = codeComplexity;
    }

    public double getCodeDuplicationDensity() {
        return codeDuplicationDensity;
    }

    public void setCodeDuplicationDensity(double codeDuplicationDensity) {
        this.codeDuplicationDensity = codeDuplicationDensity;
    }

    public double getCodeViolationsDensity() {
        return codeViolationsDensity;
    }

    public void setCodeViolationsDensity(double codeViolationsDensity) {
        this.codeViolationsDensity = codeViolationsDensity;
    }

    public double getNumberOfTests() {
        return numberOfTests;
    }

    public void setNumberOfTests(double numberOfTests) {
        this.numberOfTests = numberOfTests;
    }

    public double getTechnicalDebt() {
        return technicalDebt;
    }

    public void setTechnicalDebt(double technicalDebt) {
        this.technicalDebt = technicalDebt;
    }

    public double getCommentPercentage() {
        return commentPercentage;
    }

    public void setCommentPercentage(double commentPercentage) {
        this.commentPercentage = commentPercentage;
    }

    public double getLinesOfCode() {
        return linesOfCode;
    }

    public void setLinesOfCode(double linesOfCode) {
        this.linesOfCode = linesOfCode;
    }
}
