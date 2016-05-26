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
    }

    public void generate() {

        if (densityVal <= 15) {
            this.result = duplicationVal < duplicationComp ? (int) (Math.abs(duplicationVal - duplicationComp) * 20) : 0;
            giveBonus(densityVal < 5);
        }
        putScoreWithinBounds(this.result);
    }

}
