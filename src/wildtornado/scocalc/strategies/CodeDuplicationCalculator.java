package wildtornado.scocalc.strategies;

import wildtornado.scocalc.objects.DataInput;

public class CodeDuplicationCalculator extends BaseCalculator {
    private double duplicationVal;
    private double duplicationComp;
    private double densityVal;

    public CodeDuplicationCalculator(DataInput dp, DataInput comp) {
        this.duplicationVal = dp.getCodeDuplication();
        this.duplicationComp = comp.getCodeDuplication();
        this.densityVal = dp.getCodeDuplicationDensity();

        this.minimumAmount = 15;
        this.bonusAmount = 5;
        this.score = 25;
    }

    public void generate() {

        if (densityVal <= minimumAmount) {
            this.result = duplicationVal < duplicationComp ? (int) (Math.abs(duplicationVal - duplicationComp) * score) : minScore;
            giveBonus(densityVal < bonusAmount);
        }
        putScoreWithinBounds(this.result);
    }

}
