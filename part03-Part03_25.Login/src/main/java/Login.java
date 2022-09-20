
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter username: ");
        String userName = scanner.nextLine();
        System.out.print("Enter password: ");
        String passWord = scanner.nextLine();
        
        boolean success = false;
        if (userName.equals("alex")) {
            if (passWord.equals("sunshine")) {
                success = true;
            }       
        }
        if (userName.equals("emma")) {
            if (passWord.equals("haskell")) {
                success = true;
            }       
        }
        
        if (success) {
            System.out.println("You have succesfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
    
}
