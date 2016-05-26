package wildtornado.scocalc.calculators;

import wildtornado.scocalc.objects.DataInput;

public interface Calculator {

    public int generate(DataInput dp, DataInput comp);

    public int giveBonus(boolean condition);

    public int putScoreWithinBounds(int temp);

}
