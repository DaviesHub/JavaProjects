package JavaProjects;
/* This program calculated the LCM of two integers
 * It receives the integers input and produces the LCM as output
 */

import java.util.Scanner;

public class LcmCalculator {
    public static void main(String[] args) {
        // Declare variables
        int numOne;
        int numTwo;
        int maxNum;
        int minNum;
        int lcm;

        // Prompt user for input
        do {
            System.out.print("Enter two integers separated by one space: ");
            Scanner scanner = new Scanner(System.in);
            numOne = scanner.nextInt();
            numTwo = scanner.nextInt();
        } while (numOne <= 0 || numTwo <= 0);

        // Compute LCM of the inputs
        while (true) {
            if (numOne == numTwo) {
                lcm = numOne;
                break;
            }
            else {
                // Find the smallest number
                if (numOne > numTwo) {
                    maxNum = numOne;
                    minNum = numTwo;
                }
                else {
                    maxNum = numTwo;
                    minNum = numOne;
                }
        }

    }
}