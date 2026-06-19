package DSA;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() ==0) return "";

        Map<Character, Integer> targetMap = new HashMap<>();

        for (char c : t.toCharArray()) {
            targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);
        }

        int required = targetMap.size();
        int left = 0, right = 0, formed = 0;
        Map<Character, Integer> windowMap = new HashMap<>();

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while ( right < s.length()) {
            char c = s.charAt(right);

            windowMap.put(c, windowMap.getOrDefault(c, 0) +1);

            if (targetMap.containsKey(c) && windowMap.get(c).intValue() == targetMap.get(c).intValue()) {
                formed++;
            }

            while(left <= right && formed == required) {
                char leftChar = s.charAt(left);
                if(right -left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }
                windowMap.put(leftChar, windowMap.get(leftChar) - 1);

                if (targetMap.containsKey(leftChar) && windowMap.get(leftChar)< targetMap.get(leftChar)) {
                    formed--;
                }
                left++;
            }
            right++;
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }

    public static void main(String[] args) {
        MinimumWindowSubstring sol = new MinimumWindowSubstring();
        System.out.println(sol.minWindow("ADOBECODEBANC", "ABC")); // BANC
    }
}
