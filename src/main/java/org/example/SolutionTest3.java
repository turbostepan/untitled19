package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest3 {

    @Test
    void testEmptyInput() {
        Solution3 solution3 = new Solution3();
        int result = solution3.lengthOfLongestSubstring("");
        assertEquals(0, result);
    }

    @Test
    void testSingleCharacterInput() {
        Solution3 solution3 = new Solution3();
        int result = solution3.lengthOfLongestSubstring("a");
        assertEquals(1, result);
    }

    @Test
    void testExampleInput() {
        Solution3 solution3 = new Solution3();
        int result = solution3.lengthOfLongestSubstring("abcabcbb");
        assertEquals(3, result);
    }

    @Test
    void testRepeatingCharacters() {
        Solution3 solution3 = new Solution3();
        int result = solution3.lengthOfLongestSubstring("bbbbb");
        assertEquals(1, result);
    }

    @Test
    void testLongestSubstringWithMultipleOccurrences() {
        Solution3 solution3 = new Solution3();
        int result = solution3.lengthOfLongestSubstring("pwwkew");
        assertEquals(3, result);
    }
}