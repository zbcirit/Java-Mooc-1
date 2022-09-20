
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(9);
        numbers.add(8);
        numbers.add(7);
        numbers.add(6);
        numbers.add(5);
        
        System.out.println("array: " + numbers);
        
        removeLast(numbers);
        System.out.println("removed last member. new array: " + numbers);
        removeLast(numbers);
        System.out.println("removed last member. new array: " + numbers);
        removeLast(numbers);
        System.out.println("removed last member. new array: " + numbers);
    }
    
    public static void removeLast(ArrayList<Integer> list) {
        if (list.size() == 0) {
            return;
        }
        
        list.remove(list.size()-1);
    }

}
