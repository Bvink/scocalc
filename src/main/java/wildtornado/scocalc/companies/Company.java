package wildtornado.scocalc.companies;

import wildtornado.scocalc.objects.Score;

public interface Company {

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
