// day 26 (8/15/2025) -- OK, so I talked things out with Jenan. We are still together, and we got alot out and I'm content now. Now we just see how life goes. Like she 
// even said how she doesn't wanna lose me which is AMAZING. But ya, also decided to completely remake the trading bot so hopefully this new one actually works now. 
// Also gonna try fantasy betting with chatGPT. So lets see if that works also???

public class Main26 {
    public static void main(String[] args) {

        String name = "Bro";
        int age = 25;

        happyBirthday(name, age);

        System.out.println(square(3));

    }
    static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday to you!\n");
    }
    static double square(double number){
        return number * number;
    }
} 
