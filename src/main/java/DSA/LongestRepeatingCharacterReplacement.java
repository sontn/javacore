package DSA;

public class LongestRepeatingCharacterReplacement {
    public static int characterReplacement(String s, int k) {
        int n = s.length();
        int maxLength = 0;

        for (int i = 0; i < n; i++ ) {
            int[] freq = new int[26];

            for (int j = i; j < n; j ++) {
                char c = s.charAt(j);
                freq[c - 'A']++;

                int maxFreq = 0;
                for (int f: freq) {
                    if (f > maxFreq) {
                        maxFreq = f;
                    }
                }

                int length = j - i + 1;
                int need = length - maxFreq;
                if (need <= k) {
                    maxLength = Math.max(maxLength, length);
                }
            }

        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "AABABBACDCDFERREER";
        int k = 2;

        int result = characterReplacement(s, k);
        System.out.println("Result = " + result);
    }
}
