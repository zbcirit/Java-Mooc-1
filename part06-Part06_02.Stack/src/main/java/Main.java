
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        s.add("value1");
        s.add("value2");
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        System.out.println(s.take());
        System.out.println(s.values());

    }
}
