// day 13 (7/25/2025) 

public class Main13 {
    public static void main(String[] args) {

        String name = "Alexx";

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf("l");
        int lastIndex = name.lastIndexOf("x"); // use quotes

        name = name.toUpperCase();            // converts to uppercase
        name = name.toLowerCase();            // then back to lowercase
        name = name.trim();                   // removes leading/trailing spaces
        name = name.replace("e", "g");        // replace 'e' with 'g'

        System.out.println("Length: " + length);
        System.out.println("First letter: " + letter);
        System.out.println("Index of 'l': " + index);
        System.out.println("Last index of 'x': " + lastIndex);
        System.out.println("Modified name: " + name);
        System.out.println("Is empty: " + name.isEmpty());

        if (name.equals("password")) {
            System.out.println("Your name is password");
        } else {
            System.out.println("Your name is not password");
        }
    }
}
