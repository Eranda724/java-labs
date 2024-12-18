import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class LCS{
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String a;
 
        System.out.print("Enter your first word = ");
        String A = scanner.nextLine().trim();
		System.out.print("Enter your second word = ");
        String B = scanner.nextLine().trim();
 
        List<String> lcsResults = findLCS(A, B);
        for (String result : lcsResults) {
            System.out.println(result);
			break;
			
        }
    }
 
    private static List<String> findLCS(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
 
        int[][] dp = new int[m + 1][n + 1];
 
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
 
        List<String> lcsResults = new ArrayList<>();
        backtrack(dp, str1, str2, m, n, "", lcsResults);
 
        return lcsResults;
    }
 
    private static void backtrack(int[][] dp, String str1, String str2, int i, int j, String current, List<String> results) {
        if (i == 0 || j == 0) {
            results.add(new StringBuilder(current).reverse().toString());
            return;
        }
 
        if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
            backtrack(dp, str1, str2, i - 1, j - 1, current + str1.charAt(i - 1), results);
        } else {
            if (dp[i - 1][j] >= dp[i][j - 1]) {
                backtrack(dp, str1, str2, i - 1, j, current, results);
            }
            if (dp[i][j - 1] >= dp[i - 1][j]) {
                backtrack(dp, str1, str2, i, j - 1, current, results);
            }
        }
    }
}