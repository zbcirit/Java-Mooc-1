
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;
        final int MAX_AMOUNT = 100;

        while (true) {

            System.out.println("First: " + first + "/" + MAX_AMOUNT);
            System.out.println("Second: " + second + "/" + MAX_AMOUNT);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                if (amount > 0) {
                    first += amount;
                    if (first > MAX_AMOUNT) {
                        first = MAX_AMOUNT;
                    }
                }
            } else if (command.equals("move")) {
                if (amount <= first) {
                    first -= amount;
                    if (first < 0) {
                        first = 0;
                    }
                    second += amount;
                }else if (amount > first) {
                    second += first;
                    first = 0;
                }
                if (second > MAX_AMOUNT) {
                        second = MAX_AMOUNT;
                    }
            } else if (command.equals("remove")) {
                second -= amount;
                if (second < 0) {
                    second = 0;
                }
            }

        }
    }

}
