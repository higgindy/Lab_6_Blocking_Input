import java.util.Scanner;

public class FuelCosts
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);


        double gallonsInTank;
        do
        {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            while (!scanner.hasNextDouble())
            {
                System.out.println("Invalid input. Please enter a valid number.");
                System.out.print("Enter the number of gallons of gas in the tank: ");
                scanner.next();
            }

            gallonsInTank = scanner.nextDouble();
        }
        while (gallonsInTank <= 0);


        double fuelEfficiency;
        do
        {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            while (!scanner.hasNextDouble())
            {
                System.out.println("Invalid input. Please enter a valid number.");
                System.out.print("Enter the fuel efficiency in miles per gallon: ");
                scanner.next();
            }
            fuelEfficiency = scanner.nextDouble();
        }
        while (fuelEfficiency <= 0);


        double pricePerGallon;
        do
        {
            System.out.print("Enter the price of gas per gallon: ");
            while (!scanner.hasNextDouble())
            {
                System.out.println("Invalid input. Please enter a valid number.");
                System.out.print("Enter the price of gas per gallon: ");
                scanner.next();
            }
            pricePerGallon = scanner.nextDouble();
        }
        while (pricePerGallon <= 0);


        double costPer100Miles = (100 / fuelEfficiency) * pricePerGallon;
        System.out.println("Cost per 100 miles: $" + costPer100Miles);

        double distance = gallonsInTank * fuelEfficiency;
        System.out.println("The car can go approximately " + distance + " miles with the gas in the tank.");

    }
}
