/*
 * Name: Liam C
 * Course: CMP129
 * Lab: Week 01 Lab 01
 * Date: 09/10/2026
 *
 * This program calculates the interest earned and final balance of a savings account using compound interest.
 */


public class InterestEarned {
    public static void main(String[] args) {

        // create scanner for user input
        Scanner keyboard = new Scanner(System.in);

        // ask user for principal amount
        System.out.print("Enter the principal amount: ");
        while (!keyboard.hasNextDouble()) {
            System.out.println("Please enter a valid number.");
            keyboard.next();
            System.out.print("Enter the principal amount: ");
        }
        double principal = keyboard.nextDouble();

        // ask user for annual interest rate
        System.out.print("Enter the annual interest rate (%): ");
        while (!keyboard.hasNextDouble()) {
            System.out.println("Please enter a valid number.");
            keyboard.next();
            System.out.print("Enter the annual interest rate (%): ");
        }
        double annualRate = keyboard.nextDouble();

        // ask user for number of times compounded
        System.out.print("Enter the number of times interest is compounded: ");
        while (!keyboard.hasNextInt()) {
            System.out.println("Please enter a valid number.");
            keyboard.next();
            System.out.print("Enter the number of times interest is compounded: ");
        }
        int timesCompounded = keyboard.nextInt();

        // convert interest rate to decimal
        double rate = annualRate / 100;

        // calculate final amount
        double amount = principal * Math.pow(
                1 + (rate / timesCompounded),
                timesCompounded
        );

        // calculate interest earned
        double interestEarned = amount - principal;

        // display results
        System.out.printf("%nInterest Rate: %.2f%%%n", annualRate);
        System.out.printf("Times Compounded: %d%n", timesCompounded);
        System.out.printf("Principal: $%.2f%n", principal);
        System.out.printf("Interest Earned: $%.2f%n", interestEarned);
        System.out.printf("Amount in Savings: $%.2f%n", amount);

        // close scanner
        keyboard.close();
    }
}
