import java.util.Scanner;

public class RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double width, height;

        do
        {
            System.out.print("Enter the width of the rectangle: ");
            width = getUserInput(scanner);
        }
        while (width <= 0);

        do
        {
            System.out.print("Enter the height of the rectangle: ");
            height = getUserInput(scanner);
        }
        while (height <= 0);

        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonalLength = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Diagonal Length: " + diagonalLength);

    }

    private static double getUserInput(Scanner scanner)
    {
        while (!scanner.hasNextDouble())
        {
            System.out.println("Invalid input. Please enter a valid number.");
            System.out.print("Try again: ");
            scanner.next();
        }
        return Math.max(0, scanner.nextDouble());
    }
}
