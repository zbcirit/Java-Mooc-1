
public class Main {

    public static void main(String[] args) {
        // Test your class here
        Room room = new Room();
        System.out.println("empty?" + room.isEmpty());
        room.add(new Person("Lea", 183));
        room.add(new Person("Kenya", 182));
        room.add(new Person("Auli", 186));
        room.add(new Person("Nina", 172));
        room.add(new Person("Terhi", 185));
        System.out.println("empty?" + room.isEmpty());
        
        room.getPersons().forEach((person) -> {
            System.out.println(person);
        });
        
        System.out.println("shortest: " + room.shortest());
        
        for (Person person:room.getPersons()) {
            System.out.println(person);
        }
        System.out.println("shortest to tallest");
        while (!room.isEmpty()) {
            System.out.println(room.take());
        }
    }
}
