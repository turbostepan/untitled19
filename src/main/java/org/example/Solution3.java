package org.example;

import java.util.HashSet;
import java.util.Set;

class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }

        int maxLength = 0;
        int start = 0;
        Set<Character> seen = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            while (seen.contains(currentChar)) {
                seen.remove(s.charAt(start));
                start++;
            }

            seen.add(currentChar);
            maxLength = Math.max(maxLength, i - start + 1);
        }

        return maxLength;
    }
}