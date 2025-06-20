public class Main {
    public static void main(String[] args) {
        double presentValue = 1000;
        double rate = 0.1;          
        int years = 5;              

        
        double futureValueRecursive = Forecast.forecastRecursive(presentValue, rate, years);
        System.out.printf("Future Value (Recursive): %.2f\n", futureValueRecursive);

        double[] memo = new double[years + 1];
        double futureValueMemoized = Forecast.forecastMemoized(presentValue, rate, years, memo);
        System.out.printf("Future Value (Memoized): %.2f\n", futureValueMemoized);
    }
}
