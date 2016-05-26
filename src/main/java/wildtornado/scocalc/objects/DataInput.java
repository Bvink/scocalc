package wildtornado.scocalc.objects;

public class DataInput {

    //The companyID identifies which company is attempting to generate a score.
    private int companyID;

    //Code duplication is the number of code duplication present in the project.
    //The metric is duplicated_lines.
    private double codeDuplication;

    //Code duplication density is the percentage of code duplication present in the project.
    //The metric is duplicated_lines_density.
    private double codeDuplicationDensity;

    //Code violations is the number of code violations present in the project.
    //The metric is violations.
    private double codeViolations;

    //Blocker violations is the number of Blocker violations present in the project.
    //The metric is blocker_violations.
    private double blockerViolations;

    //Critical violations is the number of Critical violations present in the project.
    //The metric is critical_violations.
    private double criticalViolations;

    //Major violations is the number of Major violations present in the project.
    //The metric is major_violations.
    private double majorViolations;

    //Minor violations is the number of Minor violations present in the project.
    //The metric is minor_violations.
    private double minorViolations;

    //The amount of unit tests performed.
    //The metric is tests.
    private double numberOfTests;

    //The percentage of code covered by unit tests
    //The metric is coverage.
    private double testCoverage;

    //The amount of tests with errors
    //The metric is test_errors.
    private double testErrors;

    //The amount of failed tests.
    //The metric is	test_failures.
    private double testFailures;

    //The amount of minutes required to fix the code.
    //The metric is sqale_index.
    private double technicalDebt;

    //The percentage of comments vs lines of code.
    //The metric is comment_lines_density.
    private double commentPercentage;

    //The amount of comment lines.
    //The metric is comment_lines.
    private double commentLines;

    //The amount of commented out code.
    //The metric is commented_out_code_lines.
    private double commentedOutCodeLines;

    //The amount of lines of code.
    //The metric is ncloc.
    private double linesOfCode;

    public int getCompanyID() {
        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    public double getCodeDuplication() {
        return codeDuplication;
    }

    public void setCodeDuplication(double codeDuplication) {
        this.codeDuplication = codeDuplication;
    }

    public double getCodeDuplicationDensity() {
        return codeDuplicationDensity;
    }

    public void setCodeDuplicationDensity(double codeDuplicationDensity) {
        this.codeDuplicationDensity = codeDuplicationDensity;
    }

    public double getCodeViolations() {
        return codeViolations;
    }

    public void setCodeViolations(double codeViolations) {
        this.codeViolations = codeViolations;
    }

    public double getBlockerViolations() {
        return blockerViolations;
    }

    public void setBlockerViolations(double blockerViolations) {
        this.blockerViolations = blockerViolations;
    }

    public double getCriticalViolations() {
        return criticalViolations;
    }

    public void setCriticalViolations(double criticalViolations) {
        this.criticalViolations = criticalViolations;
    }

    public double getMajorViolations() {
        return majorViolations;
    }

    public void setMajorViolations(double majorViolations) {
        this.majorViolations = majorViolations;
    }

    public double getMinorViolations() {
        return minorViolations;
    }

    public void setMinorViolations(double minorViolations) {
        this.minorViolations = minorViolations;
    }

    public double getNumberOfTests() {
        return numberOfTests;
    }

    public void setNumberOfTests(double numberOfTests) {
        this.numberOfTests = numberOfTests;
    }

    public double getTestCoverage() {
        return testCoverage;
    }

    public void setTestCoverage(double testCoverage) {
        this.testCoverage = testCoverage;
    }

    public double getTestErrors() {
        return testErrors;
    }

    public void setTestErrors(double testErrors) {
        this.testErrors = testErrors;
    }

    public double getTestFailures() {
        return testFailures;
    }

    public void setTestFailures(double testFailures) {
        this.testFailures = testFailures;
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

    public double getCommentLines() {
        return commentLines;
    }

    public void setCommentLines(double commentLines) {
        this.commentLines = commentLines;
    }

    public double getCommentedOutCodeLines() {
        return commentedOutCodeLines;
    }

    public void setCommentedOutCodeLines(double commentedOutCodeLines) {
        this.commentedOutCodeLines = commentedOutCodeLines;
    }

    public double getLinesOfCode() {
        return linesOfCode;
    }

    public void setLinesOfCode(double linesOfCode) {
        this.linesOfCode = linesOfCode;
    }
}
