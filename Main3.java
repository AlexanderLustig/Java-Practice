import java.util.Scanner;

public class Main3{
    //day 3(7/3/2025)
    public static void main(String[] args){
        
       Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Your name is " + name);

        System.out.println("Enter your age");
        int age = scanner.nextInt();
        System.out.println("Your age is " + age);

        System.out.println("What is your gpa");
        double gpa = scanner.nextDouble();
        System.out.println("Your gpa is " + gpa);

        scanner.close(); 
    }
}
