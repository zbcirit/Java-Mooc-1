
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int positiveCount = 0;
        double sum = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            if (number < 0){
                continue;
            }
            
            positiveCount++;
            sum += number;
        }
        
        if (positiveCount > 0){
            System.out.println(sum / positiveCount);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
