// day 14 (7/26/2025) 

public class Main14 {
    public static void main(String[] args) {

        String email = "alexanderlustig77@gmail.com";
        String username = email.substring(0, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@"));

        System.out.println("Your username is: " + username);
                System.out.println("Your domain is: " + domain);
    }
}
