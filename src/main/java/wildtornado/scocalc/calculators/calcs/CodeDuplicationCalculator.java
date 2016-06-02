package wildtornado.scocalc.calculators.calcs;

import wildtornado.scocalc.calculators.BaseCalculator;
import wildtornado.scocalc.objects.DataInput;

public class CodeDuplicationCalculator extends BaseCalculator {

    public CodeDuplicationCalculator() {
        this.minimumAmount = 15;
        this.bonusAmount = 5;
        this.score = 25;
    }

    @Override
    public int generate(DataInput dp, DataInput comp) {

        int result = 0;

        if (dp.getCodeDuplicationDensity() <= minimumAmount) {
            result = dp.getCodeDuplication() < comp.getCodeDuplication() ? (int) (Math.abs(dp.getCodeDuplication() - comp.getCodeDuplication()) * score) : MIN_SCORE;
            result += giveBonus(dp.getCodeDuplicationDensity() < bonusAmount);
        }
        result = putScoreWithinBounds(result);
        return result;
    }

}
