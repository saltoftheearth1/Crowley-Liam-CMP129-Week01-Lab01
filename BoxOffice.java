/*
 * Name: Liam C
 * Course: CMP129
 * Lab: Week 01 Lab 01
 * Date: 09/10/2026
 *
 * This program calculates the box office revenue calculations with certain inputs according to directions
 */


import java.util.Scanner;

public class BoxOffice {
    public static void main(String[] args) {

        // create scanner for user input
        Scanner keyboard = new Scanner(System.in);

        // ask user for movie info
        System.out.print("Enter the movie name: ");
        String movieName = keyboard.nextLine();

        System.out.print("Enter the number of adult tickets sold: ");
        while (!keyboard.hasNextInt()) {
            System.out.println("Please enter a valid number.");
            keyboard.next(); // discard invalid input
            System.out.print("Enter the number of adult tickets sold: ");
        }
        int adultTickets = keyboard.nextInt();

        System.out.print("Enter the number of child tickets sold: ");
        while (!keyboard.hasNextInt()) {
            System.out.println("Please enter a valid number.");
            keyboard.next(); // discard invalid input
            System.out.print("Enter the number of child tickets sold: ");
        }
        int childTickets = keyboard.nextInt();

        // ticket price
        double adultPrice = 10.00;
        double childPrice = 6.00;

        // calc gross box office revenue
        double grossBoxOffice = (adultTickets * adultPrice)
                + (childTickets * childPrice);

        // theater keeps 20% of the gross revenue
        double netBoxOffice = grossBoxOffice * 0.20;

        // distributor receives the last 80%
        double distributorAmount = grossBoxOffice * 0.80;

        // display results
        System.out.printf("%-30s %s%n", "Movie Name:", movieName);
        System.out.printf("%-30s %d%n", "Adult Tickets Sold:", adultTickets);
        System.out.printf("%-30s %d%n", "Child Tickets Sold:", childTickets);
        System.out.printf("%-30s $%.2f%n", "Gross Box Office Profit:", grossBoxOffice);
        System.out.printf("%-30s $%.2f%n", "Net Box Office Profit:", netBoxOffice);
        System.out.printf("%-30s $%.2f%n", "Amount Paid to Distributor:", distributorAmount);

        // close scanner
        keyboard.close();
    }
}