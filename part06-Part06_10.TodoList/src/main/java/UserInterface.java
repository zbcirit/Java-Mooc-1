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
    private Scanner scan;
    private TodoList list;
    
    public UserInterface(TodoList list, Scanner scan) {
        this.scan = scan;
        this.list = list;
    }
    
    public void start() {
        while(true) {
            System.out.print("Command: ");
            String command = scan.nextLine();
            if (command.equals("stop")) {
                break;
            }
            processCommand(command);
        }
    }
    
    public void processCommand(String command) {
        if (command.equals("add")) {
            this.add();
        } else if ( command.equals("list")) {
            this.list();
        } else if (command.equals("remove")) {
            this.remove();
        } else {
            System.out.println("Unknown command. Please give a valid command.");
        }
    }
    
    public void add() {
        System.out.print("To add: ");
        this.list.add(scan.nextLine());
    }
    
    public void list() {
        this.list.print();
    }
    
    public void remove() {
        System.out.print("Which one is removed? ");
        int index = Integer.valueOf(scan.nextLine());
        this.list.remove(index);
    }
            
}
