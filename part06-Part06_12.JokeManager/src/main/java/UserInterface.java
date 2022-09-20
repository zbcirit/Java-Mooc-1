/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zeb
 */
import java.util.Scanner;

public class UserInterface {
    private JokeManager jokes;
    private Scanner scan;
    
    public UserInterface(JokeManager jokes, Scanner scan) {
        this.jokes = jokes;
        this.scan = scan;
    }
    
    public void start() {
        while (true) {
            System.out.println("Commands:\n1 - add a joke\n2 - draw a joke"
                + "\n3 - list jokes\nX - stop ");
            String command = scan.nextLine();
            if (command.equals("X")) {
                break;
            }
            processCommand(command);
        }
    }
    
    public void processCommand(String command) {
        if (command.equals("1")) {
            System.out.println("Write the joke to be added: ");
            String joke = scan.nextLine();
            this.jokes.addJoke(joke);
        } else if (command.equals("2")) {
            System.out.println(this.jokes.drawJoke());
        } else if (command.equals("3")) {
            System.out.println("Printing the jokes");
            this.jokes.printJokes();
        }
    }
    
}
