public class Calculator implements NewCalculator{
    @Override
    public int sum(int... vals) {
        int sum = 0;
        for (int val : vals) {
            sum += val;
        }
        return sum;
    }
}
