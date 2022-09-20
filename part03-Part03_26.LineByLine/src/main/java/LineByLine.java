
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!(input.equals(""))) {
            for (String word: input.split(" ")) {
                System.out.println(word);
            }
            input = scanner.nextLine();
        }

    }
}
