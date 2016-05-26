package wildtornado.scocalc.strategies;

import wildtornado.scocalc.objects.DataInput;

public class TechnicalDebtCalculator extends BaseCalculator {

    private double techVal;
    private double techComp;

    public TechnicalDebtCalculator(DataInput dp, DataInput comp) {
        this.techVal = dp.getTechnicalDebt();
        this.techComp = comp.getTechnicalDebt();
    }

    public void generate() {
        if (techVal != techComp) {
            this.result = techVal < techComp ? (int) (Math.abs(techVal - techComp) * 5) : 0;
        }
    }

}