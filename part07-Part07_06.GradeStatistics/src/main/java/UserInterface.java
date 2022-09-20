import java.util.Scanner;

public class UserInterface {
    private Scanner scan;
    private GradeList grades;
    
    public UserInterface (Scanner scan, GradeList grades) {
        this.grades = grades;
        this.scan = scan;
    }
    
    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = Integer.valueOf(scan.nextLine());
            if (input == -1) {
                break;
            }
            grades.addGrade(input);
        }
    }
}
