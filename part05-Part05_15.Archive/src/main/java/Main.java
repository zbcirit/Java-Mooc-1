
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<ArchiveItem> archive = readItemsIntoList();
        System.out.println("==Items==");
        for (ArchiveItem item : archive) {
            System.out.println(item);
        }
//        ArrayList<ArchiveItem> archive = new ArrayList<>();
//        ArchiveItem cat = new ArchiveItem("cat", "1");
//        ArchiveItem cat2 = new ArchiveItem("cat toy", "1");
//        
//        System.out.println(cat.equals(cat2));
//        archive.add(cat);
//        System.out.println(archive.contains(cat2));
    }

    public static ArrayList<ArchiveItem> readItemsIntoList() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArchiveItem> archive = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            if (id.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            
            ArchiveItem item = new ArchiveItem(name, id);
            if (!archive.contains(item)) {
                archive.add(item);
            }
        }
        return archive;

    }
}
