
import java.util.Arrays;


public class TransitCalculator {
    int numberOfDays;
    int numberOfRides;

    public TransitCalculator(int days, int rides){
        numberOfDays = days;
        numberOfRides = rides;
    }

    String[] fareTypes = {"Pay-per-ride", "7-day Unlimited","30-day Unlimited"};
    Double[] fareCost = {2.75, 33.00, 127.00};

    public double unlimited7Price() {
        double totalCost = (Math.ceil(numberOfDays / 7)) * fareCost[1];
        return totalCost / numberOfRides;
    }

    public double[] getRidePrices(){
        double pricePerRide = fareCost[0];
        double unlimited7Price = unlimited7Price();
        double thirtyDayUnlimited = fareCost[2] / numberOfRides;
        double[] price = {pricePerRide, unlimited7Price, thirtyDayUnlimited};
        return price; 
    }

    public String getBestFare(){

        double[] ridePrices = getRidePrices();
        int winningIndex = 0;

        for (int i = 0; i < ridePrices.length; i++) {
            
            if (ridePrices[i] < ridePrices[winningIndex]){
                winningIndex = i;
            }

        }
        return "You should get the " + fareTypes[winningIndex] + " option at $" + ridePrices[winningIndex] + " per ride."; 
    }

    public static void main(String[] args) {
        TransitCalculator myProblem = new TransitCalculator(13, 3);

        System.out.println(myProblem.getBestFare());

    }

}