package wildtornado.scocalc.strategies;

public abstract class BaseCalculator implements Calculator {

    protected static final int MIN_SCORE = 0;
    protected static final int MAX_SCORE = 1000;
    protected int result;

    protected int score;
    protected int bonusScore;
    protected int minimumAmount;
    protected int maximumAmount;
    protected int bonusAmount;

    @Override
    public void generate() {
        this.result = MAX_SCORE;
    }

    @Override
    public int run() {
        this.generate();
        return result;
    }

    @Override
    public void putScoreWithinBounds(int temp) {
        this.result = temp > MIN_SCORE ? temp : MIN_SCORE;
        this.result = temp <= MAX_SCORE ? temp : MAX_SCORE;
    }

    @Override
    public void giveBonus(boolean condition) {
        if (condition)
            this.result += bonusScore;
    }
}
