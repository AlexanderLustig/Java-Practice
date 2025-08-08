// day 21 (8/08/2025) -- Ok, so I ordered most of the things necessary for Jenan's gift basket. But i made sure that everything can either be returned or used for another girl
// cause tbh idk if its gonna work out with Jenan. Like she doesn't really show much interest in me and even though she says she likes me idk if I vibe with it. But we will see

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
