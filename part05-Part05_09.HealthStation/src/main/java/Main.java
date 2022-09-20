
public class Main {

    public static void main(String[] args) {
        // write experimental code here to check how your program functions
        HealthStation station = new HealthStation();
        
        Person ethan = new Person("Ethan", 1, 110, 7);
        Person peter = new Person("Peter", 33, 176, 85);
        
        station.feed(ethan);
        station.feed(ethan);
        
        System.out.println(ethan.getName() + "'s weight: " + station.weigh(ethan) 
                + " kilos");
        System.out.println(peter.getName() + "'s weight: " + station.weigh(peter) 
                + " kilos");
        station.feed(ethan);
        station.feed(peter);
        System.out.println(ethan.getName() + "'s weight: " + station.weigh(ethan) 
                + " kilos");
        System.out.println(peter.getName() + "'s weight: " + station.weigh(peter) 
                + " kilos");
        
        System.out.println("Weighings performed: " + station.weighings());
    }
}
