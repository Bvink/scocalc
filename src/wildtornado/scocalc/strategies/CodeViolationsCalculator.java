package wildtornado.scocalc.strategies;

import wildtornado.scocalc.objects.DataInput;

public class CodeViolationsCalculator extends BaseCalculator {

    private double codeViolationVal;
    private double codeViolationComp;

    public CodeViolationsCalculator(DataInput dp, DataInput comp) {
        this.codeViolationVal = dp.getCodeViolations();
        this.codeViolationComp = comp.getCodeViolations();

        this.bonusAmount = 10;
        this.score = 200;
    }

    public void generate() {
        this.result = codeViolationVal < codeViolationComp ? (int) (Math.abs(codeViolationVal - codeViolationComp) * score) : minScore;
        giveBonus(codeViolationVal <= bonusAmount);
        putScoreWithinBounds(this.result);
    }

}