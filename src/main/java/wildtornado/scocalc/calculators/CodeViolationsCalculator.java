package wildtornado.scocalc.calculators;

import wildtornado.scocalc.objects.DataInput;

public class CodeViolationsCalculator extends BaseCalculator {

    public CodeViolationsCalculator() {
        this.bonusAmount = 25;
        this.score = 100;
    }

    @Override
    public int generate(DataInput dp, DataInput comp) {

        int result = 0;

        int maxBlockers = 0;
        int maxCriticals = 1;
        int maxMajors = 15;
        int maxMinors = 55;

        int criticalScoreBonus = 150;
        int majorScoreBonus = 75;

        if (Math.abs(dp.getBlockerViolations() - maxBlockers) < 0.00000001
                && dp.getCriticalViolations() <= maxCriticals
                && dp.getMajorViolations() <= maxMajors
                && dp.getMinorViolations() <= maxMinors) {

            result += calcPartialScore(dp.getCriticalViolations(), comp.getCriticalViolations(), score + criticalScoreBonus);
            result += calcPartialScore(dp.getMajorViolations(), comp.getMajorViolations(), score + majorScoreBonus);
            result += calcPartialScore(dp.getMinorViolations(), comp.getMinorViolations(), score);
            result += giveBonus(dp.getCodeViolations() <= bonusAmount);
            result = putScoreWithinBounds(result);
        }

        return result;
    }

    private int calcPartialScore(double val, double comp, int score) {
        return val < comp ? (int) (Math.abs(val - comp) * score) : MIN_SCORE;
    }

}