import java.util.Scanner;

public class MetricConverter
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double meters;

        do
        {
            System.out.print("Enter a measurement in meters: ");
            while (!scanner.hasNextDouble())
            {
                System.out.println("Invalid input. Please enter a valid number.");
                System.out.print("Try again: ");
                scanner.next();
            }
            meters = scanner.nextDouble();
        }
        while (meters <= 0);

        double miles = meters * 0.000621371;
        double feet = meters * 3.28084;
        double inches = meters * 39.3701;

        System.out.println("The Conversion Results are:");
        System.out.println("Miles: " + miles);
        System.out.println("Feet: " + feet);
        System.out.println("Inches: " + inches);

    }
}
