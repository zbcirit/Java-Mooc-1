
public class Main {

    public static void main(String[] args) {
        // you can write code here to try out your program
        Person a = new Person("Anna", new SimpleDate(1,1,1), 1, 1);
        Person b = new Person("Anna", new SimpleDate(1,1,1), 1, 1);
        
        System.out.println(a.equals(b));
    }
}
