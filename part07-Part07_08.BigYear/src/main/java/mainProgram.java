
import java.util.Scanner;
import java.util.ArrayList;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<>();
        
        while(true) {
            System.out.print("? ");
            String command = scan.nextLine();
            
            if (command.equals("Quit")) {
                break;
            } else if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String nameLatin = scan.nextLine();
                
                birds.add(new Bird(name, nameLatin));
            } else if (command.equals("All")) {
                for (Bird bird: birds) {
                    System.out.println(bird);
                }
            } else if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String birdName = scan.nextLine();
                boolean listContainsBird = false;
                for(Bird bird: birds) {
                    if (bird.isBirdNamed(birdName)) {
                        bird.increaseObservationCount();
                        listContainsBird = true;
                    }
                }
                if (!listContainsBird) {
                    System.out.println("Not a bird!");
                }
            } else if (command.equals("One")) {
                System.out.print("Bird? ");
                String birdName = scan.nextLine();
                for(Bird bird: birds) {
                    if (bird.isBirdNamed(birdName)) {
                        System.out.println(bird);
                    }
                }
            }
            
        }
    }
}
