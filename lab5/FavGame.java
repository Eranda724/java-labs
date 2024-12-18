import java.util.*;

public class FavGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        HashMap<String, Integer> sportCount = new HashMap<>();
        int footballCount = 1;

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String person = input[0];
            String sport = input[1];

            if (!sportCount.containsKey(person)) {
                sportCount.put(person, 1);
                if (sport.equals("FOOTBALL")) {
                    footballCount++;
                }
            }
            else {
                continue; // Skip if already encountered the person
            }

            sportCount.put(sport, sportCount.getOrDefault(sport, 0) + 1);
        }

        scanner.close();

        // Find the most popular sport
        int maxCount = 0;
        String mostPopularSport = "";

        for (Map.Entry<String, Integer> entry : sportCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostPopularSport = entry.getKey();
            } else if (entry.getValue() == maxCount && entry.getKey().compareTo(mostPopularSport) < 0) {
                mostPopularSport = entry.getKey();
            }
        }

        System.out.println(mostPopularSport);
        System.out.println("Football " + footballCount);
    }
}