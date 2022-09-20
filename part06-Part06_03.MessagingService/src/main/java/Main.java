import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        MessagingService m = new MessagingService();
        
        m.add(new Message("jane", "Howdy?"));
        m.add(new Message("janet", "Howdy, partner?"));
        ArrayList<Message> n = m.getMessages();
        System.out.println(m.getMessages());
        for (Message mes: n) {
            System.out.println(mes);
        }
        
    }
}
