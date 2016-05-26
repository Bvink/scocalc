package wildtornado.scocalc.calculators;

public interface Calculator {

    public void generate();

    public int run();

    public void giveBonus(boolean condition);

    public void putScoreWithinBounds(int temp);

}
