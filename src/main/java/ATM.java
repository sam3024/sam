import java.util.Scanner;

public class ATM {
    /**
     * Prints the amount to dispense in available denominations.
     *
     * @param amount The amount in dollars.
     */
    public static void dispense(double amount) {
        // Convert the amount to cents
        int totalCents = (int) Math.round(amount * 100);

        // Calculate the number of each denomination
        int twenties = totalCents / 2000;
        totalCents %= 2000;

        int tens = totalCents / 1000;
        totalCents %= 1000;

        int fives = totalCents / 500;
        totalCents %= 500;

        int ones = totalCents / 100;
        totalCents %= 100;

        int quarters = totalCents / 25;
        totalCents %= 25;

        int dimes = totalCents / 10;
        totalCents %= 10;

        int nickels = totalCents / 5;
        totalCents %= 5;

        int pennies = totalCents; // Remaining cents are all pennies

        // Output the results
        System.out.println(amount + " contains:");
        System.out.println(twenties + " in $20");
        System.out.println(tens + " in $10");
        System.out.println(fives + " in $5");
        System.out.println(ones + " in $1");
        System.out.println(quarters + " in 25¢");
        System.out.println(dimes + " in 10¢");
        System.out.println(nickels + " in 5¢");
        System.out.println(pennies + " in 1¢");
    }

    // DO NOT TOUCH THE CODE BELOW THIS LINE
    public static void main(String[] arg) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter amount:");
        double amount = scn.nextDouble();
        dispense(amount);
    }
}
