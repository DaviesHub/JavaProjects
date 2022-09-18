package JavaProjects;
/* This program calculated the LCM of two integers
 * It receives the integers input and produces the LCM as output
 */

import java.util.Scanner;

public class LcmCalculator {
    public static void main(String[] args) {
        // Declare variables
        long numOne;
        long numTwo;
        long maxNum;
        long minNum;
        long lcm;

        // Prompt user for input
        do {
            System.out.print("Enter two positive integers separated by one space: ");
            Scanner scanner = new Scanner(System.in);
            numOne = scanner.nextLong();
            numTwo = scanner.nextLong();
        } while (numOne <= 0 || numTwo <= 0);

        // Compute LCM of the inputs
        if (numOne == numTwo) {
                lcm = numOne;
            }
        else {
            // Find the largest number
            if (numOne > numTwo) {
                maxNum = numOne;
                minNum = numTwo;
            }
            else {
                maxNum = numTwo;
                minNum = numOne;
            }
            long i = 0;
            long multiple;
            while (true) {
                multiple = maxNum + (maxNum * i);
                if (multiple % maxNum == 0 && multiple % minNum == 0) {
                    lcm = multiple;
                    break;
                }
                else {
                    i++;
                }
            }
        }
        System.out.println("The lcm is " + lcm);
    }
}