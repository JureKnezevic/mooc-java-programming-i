
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String fileName = scan.nextLine();
        ArrayList<String> results = new ArrayList<>();

        try ( Scanner read = new Scanner(Paths.get(fileName))) {
            while (read.hasNextLine()) {
                String row = read.nextLine();

                String[] parts = row.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                String homePoints = parts[2];
                String visitingPoints = parts[3];

                results.add(homeTeam + " " + visitingTeam + " " + homePoints + " " + visitingPoints);

            }
        } catch (Exception e) {
            System.out.println("nekaj nevalja" + e.getMessage());

        }
        System.out.println(results);

        System.out.println("Team:");

        String teamInput = scan.nextLine();

        int games = 0;
        for (int i = 0; i < results.size(); i++) {

            if (results.get(i).contains(teamInput)) {

                games = games + 1;

            }
        }

        System.out.println("Games: " + games);

        int total = 0;
        int wins = 0;
        int losses = 0;

        while (wins + losses < games) {

            String wlPartsRow = results.get(total);
            String[] wlParts = wlPartsRow.split(" ");

            if (wlParts[0].contains(teamInput)) {
                if (Integer.valueOf(wlParts[2]) > Integer.valueOf(wlParts[3])) {
                    wins = wins + 1;
                } else {
                    losses = losses + 1;
                }

            }

            if (wlParts[1].contains(teamInput)) {
                if (Integer.valueOf(wlParts[2]) < Integer.valueOf(wlParts[3])) {
                    wins = wins + 1;
                } else {
                    losses = losses + 1;
                }

            }

            total++;
        }

        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
