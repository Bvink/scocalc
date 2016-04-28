package wildtornado.scocalc.companies;

public interface Company {

    public int generateScore();

    public int CalculateCodeComplexity(int val);

    public int CalculateCodeDuplicationDensity(int val);

    public int CalculateCodeViolationsDensity(int val);

    public int CalculateCommentsPercentage(int val);

    public int CalculateLinesOfCode(int val);

    public int CalculateTechnicalDebt(int val);

    public int CalculateTestCoverage(int val);

}
