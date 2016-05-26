package wildtornado.scocalc.companies;

import wildtornado.scocalc.objects.Score;

public interface Company {

    public Score generateScore();

    public void CalculateCodeDuplication();

    public void CalculateCodeViolations();

    public void CalculateComments();

    public void CalculateLinesOfCode();

    public void CalculateTechnicalDebt();

    public void CalculateTestCoverage();

}
