
public class Main {

    public static void main(String[] args) {


        // use this main method to try out your classes!
        Gift book = new Gift("Harry Potter", 2);
        System.out.println(book);
        
        Package gifts = new Package();
        gifts.addGift(book);
        System.out.println(gifts.totalWeight());
    }
}
