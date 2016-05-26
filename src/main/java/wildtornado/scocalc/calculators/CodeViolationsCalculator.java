package wildtornado.scocalc.calculators;

import wildtornado.scocalc.objects.DataInput;

public class CodeViolationsCalculator extends BaseCalculator {

    private double codeViolationVal;

    private double blockerViolationVal;
    private double criticalViolationVal;
    private double criticalViolationComp;
    private double majorViolationVal;
    private double majorViolationComp;
    private double minorViolationVal;
    private double minorViolationComp;

    public CodeViolationsCalculator(DataInput dp, DataInput comp) {
        this.codeViolationVal = dp.getCodeViolations();

        this.blockerViolationVal = dp.getBlockerViolations();
        this.criticalViolationVal = dp.getCriticalViolations();
        this.majorViolationVal = dp.getMajorViolations();
        this.minorViolationVal = dp.getMinorViolations();

        this.criticalViolationComp = comp.getCriticalViolations();
        this.majorViolationComp = comp.getMajorViolations();
        this.minorViolationComp = comp.getMinorViolations();

        this.bonusAmount = 25;
        this.score = 100;
    }

    @Override
    public void generate() {

        int maxBlockers = 0;
        int maxCriticals = 1;
        int maxMajors = 15;
        int maxMinors = 55;

        int criticalScoreBonus = 150;
        int majorScoreBonus = 75;

        if(Math.abs(blockerViolationVal - maxBlockers) < 0.00000001
                && criticalViolationVal <= maxCriticals
                && majorViolationVal <= maxMajors
                && minorViolationVal <= maxMinors) {
            this.result += calcPartialScore(criticalViolationVal, criticalViolationComp, score + criticalScoreBonus);
            this.result += calcPartialScore(majorViolationVal, majorViolationComp, score + majorScoreBonus);
            this.result += calcPartialScore(minorViolationVal, minorViolationComp, score);
            giveBonus(codeViolationVal <= bonusAmount);
            putScoreWithinBounds(this.result);
        }
    }

    private int calcPartialScore(double val, double comp, int score) {
        return val < comp ? (int) (Math.abs(val - comp) * score) : MIN_SCORE;
    }

}