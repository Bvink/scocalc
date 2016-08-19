package wildtornado.scocalc.companycalculators;

import wildtornado.scocalc.objects.Score;

public interface CompanyCalculations {

    public Score generateScore();

    public void calculateCodeDuplication();

    public void calculateCodeViolations();

    public void calculateComments();

    public void calculateLinesOfCode();

    public void calculateTechnicalDebt();

    public void calculateTestCoverage();

    public void calculateAverageScore(int metricAmount);

    public void calculateCoins(int coinDivider);

}
