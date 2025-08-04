// day 18 (8/04/2025) -- Ok, so had a date then work so im back now. Date went ok, but in the end it sounded like she freindzoned me.
// so i asked what she meant when i got home and she said she open to dating in near future which is a good sign. Plus she mentioned
// that if someone were to ask bout me she would just say im her bf which ig is a really good sign. Now just doing research in how to 
// make a gift basket for her to ask her out officially. Also, rn she has all green flags except for her texting. Bro it takes her
// hours and hours to respond back like ik she mentioned how this is normal for her and she does it to her friends and family also 
// but like still ughhh its something imma have to really get used to. 

import java.util.Scanner;

public class Main18 {
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the day of the week: ");

    String day = scanner.nextLine();

    switch(day){
        case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It is a weekday");
        case "Saturday", "Sunday" -> System.out.println("It is a weekend");
        default -> System.out.println(day + " is not a day");
    }

    }
}
