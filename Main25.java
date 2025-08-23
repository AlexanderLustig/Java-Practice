// day 25 (8/13/2025) 

public class Main25 {
    public static void main(String[] args) {

    int counter = 1;

    for(int i = 0; i < 5; i++){
       for(int j = counter; j > 0; j--){
            System.out.print("*");
            
        }
        counter++;
        System.out.print("\n");
    }

    }
} 
