package DSA;

public class DecodeWays {
    public int numDecodings(String s) {
        int n = s.length();

        int next1 = 1; // dp[i+1]
        int next2 = 0; // dp[i+2]

        for (int i = n - 1; i >= 0; i--) {
            int cur = 0;

            if (s.charAt(i) != '0') {
                cur = next1;

                if (i + 1 < n) {
                    int num = (s.charAt(i) - '0') * 10 + (s.charAt(i + 1) - '0');

                    if (num >= 10 && num <=26) {
                        cur += ( i + 2 <= n -1) ? next2 : 1;
                    }
                }
            }

            next2 = next1;
            next1 = cur;
        }

        return next1;
    }

}
