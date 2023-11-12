import java.util.Scanner;

public class CtoFConverter
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double celsiusTemperature;

        do
        {
            System.out.print("Enter temperature in Celsius: ");

            while (!scanner.hasNextDouble())
            {
                System.out.println("Invalid input. Please enter a valid number.");
                System.out.print("Enter temperature in Celsius: ");
                scanner.next();
            }

            celsiusTemperature = scanner.nextDouble();


        } while (celsiusTemperature < -273.15);

        double fahrenheitTemperature = (celsiusTemperature * 9/5) + 32;
        System.out.println("Equivalent temperature in Fahrenheit: " + fahrenheitTemperature);

    }
}
