// day 26 (8/15/2025) 

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
