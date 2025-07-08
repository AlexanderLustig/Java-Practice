import java.util.Scanner;
public class Main6{
    //day 6(7/8/2025) --- Went to Church on 6th and Dorney Park on 7th

    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    
    System.out.print("What item would you like to buy?: ");
    String item = scanner.nextLine();
    System.out.print("What is the price for each?: ");
    double price = scanner.nextDouble();
    System.out.print("How many would you like?: ");
    int amount = scanner.nextInt();

    System.out.println("You have bought " + amount + " " + item + "/s");
    System.out.println("Your total is $" + price * amount);

    scanner.close(); 
    }
}
