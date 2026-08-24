public class Main {
    static public void main(String[] args) {
        final NewCalculator newCalculator = new Calculator();
        final NewCalculator oldCalculator = new AdaptCalculator(new OldCalculator());
        final int[] vals = new int[] {53, 24, 75, 12};
        int sum = 0;
        for (int val : vals) {
            sum += val;
        }
        assert newCalculator.sum(vals) == sum : "newCalculator sum error";
        assert oldCalculator.sum(vals) == sum : "oldCalculator sum error";
        System.out.printf("The sum from both calculators in %d%n", sum);
    }
}
