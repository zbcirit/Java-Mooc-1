
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        double value = Double.valueOf(scan.nextLine());
        
        if (value < 5000){
            System.out.println("No tax!");
        } else if (value < 25000){
            System.out.println("Tax: " + ((value - 5000) * 0.08 + 100));
        } else if (value < 55000){
            System.out.println("Tax: " + ((value - 25000) * 0.1 + 1700));
        } else if (value < 200000){
            System.out.println("Tax: " + ((value - 55000) * 0.12 + 4700));
        } else if (value < 1000000){
            System.out.println("Tax: " + ((value - 200000) * 0.15 + 22100));
        } else {
            System.out.println("Tax: " + ((value - 1000000) * 0.17 + 142100));
        }

    }
}
