// day 32 (8/25/2025)

import java.util.Arrays;
import java.util.Scanner;

public class Main32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] foods = new String[3];

        System.out.println("Give 3 foods that you like below.");
        System.out.print("Food 1: ");
        foods[0] = scanner.nextLine();

        System.out.print("Food 2: ");
        foods[1] = scanner.nextLine();

        System.out.print("Food 3: ");
        foods[2] = scanner.nextLine();

        System.out.println("Your list of favorite foods is: " + Arrays.toString(foods));

        scanner.close();
    }
}
