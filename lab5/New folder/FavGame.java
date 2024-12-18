import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
public class FavGame {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
 
        Map<String, String> favoriteSports = new HashMap<>();
        Map<String, Integer> sportCount = new HashMap();
 
        String mostPopularSport = "";
        int maxCount = 0;
        int footballCount = 0;
 
        for (int i = 0; i < N; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            String sport = input[1];
 
            if (!favoriteSports.containsKey(name)) {
                favoriteSports.put(name, sport);
                int count = sportCount.getOrDefault(sport, 0) + 1;
                sportCount.put(sport, count);
 
                if (count > maxCount || (count == maxCount && sport.compareTo(mostPopularSport) < 0)) {
                    mostPopularSport = sport;
                    maxCount = count;
                }
 
                if (sport.equals("football")) {
                    footballCount++;
                }
            }
        }
 
        System.out.println(mostPopularSport);
        System.out.println("Football " + footballCount);
    }
}