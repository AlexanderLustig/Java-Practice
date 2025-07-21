//day 11(7/21/2025) -- Ughhh, not much to say reallly. finally got Sierra off my back. She texted me yesterday and tried to get me back like girl no tf. But whatever
//its over now.Plus I have a date tmrw with Jenan so thats good

import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (e.g. enter 5 for 5%): ");
        double annualRatePercent = scanner.nextDouble();
        double rate = annualRatePercent / 100;

        System.out.print("Enter the number of times interest is compounded per year: ");
        int compoundsPerYear = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        // Compound interest formula
        double finalAmount = principal * Math.pow((1 + rate / compoundsPerYear), compoundsPerYear * years);

        System.out.printf("Your final amount of money is: $%.2f\n", finalAmount);

        scanner.close();
    }
}
