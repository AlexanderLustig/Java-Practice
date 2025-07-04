import java.util.Scanner;

public class Main4 {
    // Day 4 (7/4/2025) - MAD LIBS Game
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me an adjective");
        String adjective1 = scanner.nextLine();

        System.out.println("Give me an adjective");
        String adjective2 = scanner.nextLine();

        System.out.println("Give me a bird type");
        String birdType = scanner.nextLine();

        System.out.println("Give me a room type");
        String roomType = scanner.nextLine();

        System.out.println("Give me a verb past tense");
        String verbPast = scanner.nextLine();

        System.out.println("Give me a relative's name");
        String relativeName = scanner.nextLine();

        System.out.println("Give me a noun");
        String noun1 = scanner.nextLine();

        System.out.println("Give me a verb");
        String verb = scanner.nextLine();

        System.out.println("Give me a liquid");
        String liquid = scanner.nextLine();

        System.out.println("Give me a verb ending in -ing");
        String ingVerb = scanner.nextLine();

        System.out.println("Give me a body part (plural)");
        String bodyParts = scanner.nextLine();

        System.out.println("Give me a noun (plural)");
        String pluralNoun = scanner.nextLine();

        System.out.println("Give me a verb ending in -ing");
        String ingVerb2 = scanner.nextLine();

        System.out.println("Give me a noun");
        String noun2 = scanner.nextLine();

        System.out.println("\nHere is the text with your answers:");
        System.out.println("It was a " + adjective1 + ", cold November day. I");
        System.out.println("woke up to the " + adjective2 + " smell of " + birdType);
        System.out.println("roasting in the " + roomType + " downstairs. I " + verbPast);
        System.out.println("down the stairs to see if I could help " + verb + " the dinner.");
        System.out.println("My mom said, 'See if " + relativeName + " needs a fresh " + noun1 + ".'");
        System.out.println("So I carried a tray of glasses full of " + liquid + " into the " + ingVerb + " room.");
        System.out.println("When I got there, I couldn't believe my " + bodyParts + "!");
        System.out.println("There were " + pluralNoun + " " + ingVerb2 + " on the " + noun2 + ".");

        scanner.close();
    }
}
