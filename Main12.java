// day 12 (7/23/2025) 

public class Main12 {
    public static void main(String[] args) {
       
    boolean isStudent = true;
    int age = 17;
    if(isStudent){
        if(age >= 18){
            System.out.println("Price of admissions is $15");
        }else{
            System.out.println("Price of admissions is $0");
        }
    }else if(age >= 18){
            System.out.println("Price of admissions is $25");
        }else{
            System.out.println("Price of admissions is $10");
        }
    }
}
