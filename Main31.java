// day 31 (8/23/2025)

public class Main31 {
    public static void main(String[] args) {

        String[] fruit = {"apple", "orange", "banana"};

        fruit[0] = "pineapple";
        int num = fruit.length;

        System.out.println(fruit[0] + num);

        for(int i = 0; i < num; i++){
            System.out.println(fruit[i]);
        }

    }
} 
