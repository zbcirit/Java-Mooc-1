
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String teamName = scan.nextLine();
        int games = 0;
        int wins = 0;
            
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            
            while (fileReader.hasNextLine()) {
                
                String line = fileReader.nextLine();
                
                if (!line.contains(teamName)) {
                    continue;
                }
                
                String[] values = line.split(",");
                String homeTeam = values[0];
                String visitingTeam = values[1];
                int homePoints = Integer.valueOf(values[2]);
                int visitingPoints = Integer.valueOf(values[3]);
                
                if (homeTeam.equals(teamName) && homePoints > visitingPoints) {
                    wins++;
                } else if (visitingTeam.equals(teamName) && visitingPoints > homePoints) {
                    wins++;
                }
                 games++;
            }
        } catch (Exception e) {
            System.out.println("Error reading file: " + file);
        }
        
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + (games - wins));
    }
    
}
