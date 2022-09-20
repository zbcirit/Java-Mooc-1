
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;
        int longest = 0;
        String longestName = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] parts = input.split(",");
            
            String name = parts[0];
            int year = Integer.valueOf(parts[1]);
            
            sum += year;
            count++;
            
            if (name.length() > longestName.length()) {
                longestName = name;
            }
        }
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birthyears: " + 1.0 * sum / count);


    }
}
