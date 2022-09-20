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

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("add")) {
                this.add();
            } else if (command.equals("search")) {
                System.out.println(this.search());
            } else {
                System.out.println("Unknown command");
            }
        }
    }

    public void add() {
        System.out.print("Word: ");
        String word = scanner.nextLine();
        System.out.print("Translation: ");
        String translation = scanner.nextLine();
        this.dictionary.add(word, translation);
    }
    
    public String search() {
        System.out.print("To be translated: ");
        String word = scanner.nextLine();
        String translation = this.dictionary.translate(word);
        if (translation == null) {
            return "Word " + word + " was not found";
        }
        return "Translation: " + this.dictionary.translate(word);
    }

}
