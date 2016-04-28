package wildtornado.scocalc.companies;

import wildtornado.scocalc.objects.Score;

public interface Company {

    public Score generateScore();

    public void CalculateCodeComplexity();

    public void CalculateCodeDuplicationDensity();

    public void CalculateCodeViolationsDensity();

    public void CalculateCommentsPercentage();

    public void CalculateLinesOfCode();

    public void CalculateTechnicalDebt();

    public void CalculateTestCoverage();

}
