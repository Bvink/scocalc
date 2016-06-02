package wildtornado.scocalc.calculators;

public abstract class BaseCalculator implements Calculator {

    protected static final int MIN_SCORE = 0;
    protected static final int MAX_SCORE = 1000;

    protected int score;
    protected int bonusScore;
    protected int minimumAmount;
    protected int maximumAmount;
    protected int bonusAmount;

    @Override
    public int putScoreWithinBounds(int temp) {
        int val = temp > MIN_SCORE ? temp : MIN_SCORE;
        return val <= MAX_SCORE ? val : MAX_SCORE;
    }

    @Override
    public int giveBonus(boolean condition) {
        if (condition) {
            return bonusScore;
        }
        return 0;
    }

}
