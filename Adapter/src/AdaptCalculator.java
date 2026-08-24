public class AdaptCalculator implements NewCalculator{
    private final OldCalculator oldCalculator;

    public AdaptCalculator(OldCalculator oldCalculator) {
        assert  oldCalculator != null : "Argument oldCalculator is null";
        this.oldCalculator = oldCalculator;
    }

    @Override
    public int sum(int... vals) {
        int sum = vals[0];
        for (int i = 1; i < vals.length; i++) {
            oldCalculator.calculate(sum, vals[i]);
            sum = oldCalculator.getVal();
        }
        return sum;
    }
}
