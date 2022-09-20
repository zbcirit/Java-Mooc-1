
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int first = Integer.valueOf(scanner.nextLine());
        int second = Integer.valueOf(scanner.nextLine());
        
        String comparison;
        
        if (first > second) {
            comparison = "greater than ";
        } else if (first < second) {
            comparison = "smaller than ";
        } else {
            comparison = "equal to ";
        }
        
        System.out.println(first + " is " + comparison + second + ".");

    }
}
