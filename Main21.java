// day 21 (8/08/2025) 

import java.util.Scanner;

public class Main21 {
    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      String name = "";

      while(name.isEmpty()){
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
      }

      System.out.println("Hello " + name);
      

    }
}
