
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        Main.sort(array);
        System.out.println(Arrays.toString(array));
        
        String[] str = {"a", "za", "ll","ab", "z", "ca"};
        Main.sort(str);
        System.out.println(Arrays.toString(str));
        
        ArrayList<Integer> integers = new ArrayList();
        integers.add(99);
        integers.add(-11);
        integers.add(0);
        Main.sortIntegers(integers);
        System.out.println(integers);
        
        ArrayList<String> strings = new ArrayList();
        strings.add("zeb");
        strings.add("cir");
        strings.add("bur");
        Main.sortStrings(strings);
        System.out.println(strings);
        
    }
    
    public static void sort(int[] array) {
        Arrays.sort(array);
    }
    
    public static void sort(String[] array) {
        Arrays.sort(array);
    }
    
    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
        
    }
    
    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }

}
