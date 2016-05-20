package wildtornado.scocalc.strategies;

public class CodeDuplicationCalculator extends BaseCalculator {

    private double densityVal;

    public CodeDuplicationCalculator(double val, double comp, double densityVal) {
        this.val = val;
        this.comp = comp;
        this.densityVal = densityVal;
    }

    public void generate() {

        if(densityVal <= 15) {
            this.result = val < comp ? (int) (Math.abs(val - comp) * 20) : 0;
            giveBonus(densityVal < 5);
        }
        putScoreWithinBounds(this.result);
    }

}
