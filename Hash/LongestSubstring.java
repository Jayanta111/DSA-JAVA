package Hash;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcabc";
        LongestSubstring l = new LongestSubstring(); // Create an instance of the class
        int result = l.lengthOfLongestSubstring(s);
        System.out.println(result); // Output: 3
    }

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0) {
            return 0;
        }
        int maxLen = 0;
        int start = 0;
        Map<Character, Integer> charMap = new HashMap<>();
        for (int end = 0; end < n; end++) {
            char currentChar = s.charAt(end);
            if (charMap.containsKey(currentChar) && charMap.get(currentChar) >= start) {
                start = charMap.get(currentChar) + 1;

            }
            charMap.put(currentChar, end);
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }
}
