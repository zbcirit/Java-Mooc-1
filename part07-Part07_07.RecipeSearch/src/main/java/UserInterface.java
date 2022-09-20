import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

public class UserInterface {
    private Scanner scan;
    private ArrayList<Recipe> recipes;
    
    public UserInterface() {
        this.scan = new Scanner(System.in);
        this.recipes = new ArrayList<>();
    }
    
    public void start() {
        System.out.print("File to read: ");
        String filePath = scan.nextLine();
        readFile(filePath);

        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by "
                + "cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        
        while(true) {
            System.out.print("\nEnter command: ");
            String command = scan.nextLine();
            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                System.out.println("\nRecipes:");
                list();
            } else if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String searched = scan.nextLine();
                System.out.println("\nRecipes:");
                findName(searched);
            } else if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int time = Integer.valueOf(scan.nextLine());
                System.out.println("\nRecipes:");
                findCookingTime(time);
            } else if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scan.nextLine();
                System.out.println("\nRecipes:");
                findIngredient(ingredient);
            }
            
        }
    }
    
    public void readFile(String filePath) {
        try(Scanner scanFile = new Scanner(Paths.get(filePath))) {
            while (scanFile.hasNextLine()) {
                String name = scanFile.nextLine();
                int time = Integer.valueOf(scanFile.nextLine());
                Recipe newRecipe = new Recipe(name, time);
                recipes.add(newRecipe);
                String ingredient = scanFile.nextLine();
                while (!ingredient.isEmpty() && scanFile.hasNextLine()) {
                    newRecipe.addIngredient(ingredient);
                    ingredient = scanFile.nextLine();
                }
            }
        } catch (Exception e) {
            System.out.println("Error opening file: " + e.getMessage());
        }
    }
    
    public void list() {
        for (Recipe recipe: this.recipes) {
            System.out.println(recipe);
        }
    }
    public void findName(String searched) {
        for (Recipe recipe: this.recipes) {
            if (recipe.getName().contains(searched)) {
                System.out.println(recipe);
            }
        }
    }
    
    public void findCookingTime(int time) {
        for (Recipe recipe: this.recipes) {
            if (recipe.getTime()<= time) {
                System.out.println(recipe);
            }
        }
    }
    
    public void findIngredient(String ingredient) {
        for (Recipe recipe: this.recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }
        }
    }
    
    public void getRecipe(int index) {
        System.out.println(this.recipes.get(index));
    }
}
