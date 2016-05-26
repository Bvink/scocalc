package wildtornado.scocalc.strategies;

import wildtornado.scocalc.objects.DataInput;

public class CodeViolationsCalculator extends BaseCalculator {

    private double codeViolationVal;
    private double codeViolationComp;

    public CodeViolationsCalculator(DataInput dp, DataInput comp) {
        this.codeViolationVal = dp.getCodeViolations();
        this.codeViolationComp = comp.getCodeViolations();
    }

    public void generate() {
        this.result = codeViolationVal < codeViolationComp ? (int) (Math.abs(codeViolationVal - codeViolationComp) * 200) : 0;
        giveBonus(codeViolationVal <= 5);
        putScoreWithinBounds(this.result);
    }

}