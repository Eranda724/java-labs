public class new2
    public static void main(String[] args) {
        String A = "president";
        String B = "providence";
        
        int m = A.length();
        int n = B.length();
        
        int[][] dp = new int[m + 1][n + 1];
        
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (A.charAt(i - 1) == B.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        
        int length = dp[m][n];
        char[] lcs = new char[length];
        
        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (A.charAt(i - 1) == B.charAt(j - 1)) {
                lcs[length - 1] = A.charAt(i - 1);
                i--;
                j--;
                length--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }
        
        for (int k = 0; k < dp[m][n]; k++) {
            System.out.print(lcs[k]);
        }
    }
}