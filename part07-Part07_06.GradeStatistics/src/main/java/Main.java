
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        
        GradeList grades = new GradeList();
        UserInterface ui = new UserInterface(scanner, grades);
        ui.start();
        grades.printGradeStatistics();
        
    }
}
