// Create a function that takes voltage and current and returns the calculated power.

public class PowerCalculator {
    double voltageQuery = 0;
    double currentQuery = 0;
    static double power = 0;

    public static double calculator(double voltageQuery, double currentQuery) {
        return power = voltageQuery * currentQuery;
    }

    public static void main(String[] args) {
        System.out.println("Power is " + calculator(34, 15));
        
    }
}
