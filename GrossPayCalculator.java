import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String arg[]) {
        // Get number of hours worked
        System.out.println("Enter number of hours worked.");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        // Get hourly rate
        System.out.println("Enter hourly rate.");
        double rate = scanner.nextDouble();
        scanner.close();

        // Multiply hours worked and hourly rate
        double grosspay = hours * rate;

        // Display result
        System.out.println("Gross pay is: $" + grosspay);
    }
}
