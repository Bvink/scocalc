package wildtornado.scocalc.objects;

public class DataInput {

    //The companyID identifies which company is attempting to generate a score.
    private int companyID;

    //Code complexity is a value of minimum 1 that goes up, the larger it is, the worse.
    //The metric is complexity.
    private double codeComplexity;

    //Code duplication is the number of code duplication present in the project.
    //The metric is duplicated_lines.
    private double codeDuplication;

    //Code duplication density is the percentage of code duplication present in the project.
    //The metric is duplicated_lines.
    private double codeDuplicationDensity;

    //Code violations is the number of code violations present in the project.
    //The metric is violations.
    private double codeViolations;

    //The amount of unit tests performed.
    //The metric is tests.
    private double numberOfTests;

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

    public double getCodeComplexity() {
        return codeComplexity;
    }

    public void setCodeComplexity(double codeComplexity) {
        this.codeComplexity = codeComplexity;
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
