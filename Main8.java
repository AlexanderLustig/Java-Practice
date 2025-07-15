//day 8(7/15/2025) -- Ok, so nothing much really happened today. I did order tickets to Mercer labs cause i have a date tmrw with Jenan(WHICH I PRAY GOES WELL). other then
//that nothing. The dorr guys came and that was super annoying cause like idk them being here is so inconvenient and annoying


import java.util.Random;

public class Main8 {
    public static void main(String[] args) {
       Random random = new Random();
        
       int num;
       num = random.nextInt(1, 9);
       //first num is inclusive, second is exclusive
       System.out.println(num);

       double sg;
       sg = random.nextDouble(1, 9);
       //first num is inclusive, second is exclusive
       System.out.println(sg);
        
       Boolean tru;
       tru = random.nextBoolean();
       System.out.println(tru);
    }
}

