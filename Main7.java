//day 7(7/14/2025) -- Okok veryyy busy psat couple of days. Got back from a vacation to PA. Got invisaligns - which I hate the feeling of cause like they feel like grills 
//on my teeth. Then i had back to back dates. Took Sierra out first. and like she pretty and we vibed, but like ehhh 5/10. Then i had a date with Jenan, which i enjoyed a
//bunch more. Like she is tall and pretty and a NERD. So rn she easily top choice and I hope it works out with her. Oh and i also started doing these jornal things cause like
// I feel like future me would enjoy reading what i thought on these days. So imma just be writing a bunch of weird toughts here.

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How old are you?: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are not an adult");
        }

        scanner.close();
    }
}
