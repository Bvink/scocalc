package wildtornado.scocalc.strategies;

public class TestCoverageCalculator extends BaseCalculator {

    private double coverage;

    public TestCoverageCalculator(double coverage, double val, double comp, double error, double errorComp, double failure, double failureComp) {
        this.val = val - (error + failure);
        this.comp = comp - (errorComp + failureComp);
        this.coverage = coverage;
    }

    public void generate() {
        if(coverage >= 55) {
            this.result = val < comp ? (int) (Math.abs(val - comp) * 200) : 0;
            giveBonus(coverage > 80);
        }
        putScoreWithinBounds(this.result);
    }

}