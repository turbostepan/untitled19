package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest2 {

    Solution2 solution2 = new Solution2();

    @Test
    void testTargetFound() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] expected = {3, 4};
        assertArrayEquals(expected, solution2.searchRange(nums, target));
    }

    @Test
    void testTargetNotFound() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 6;
        int[] expected = {-1, -1};
        assertArrayEquals(expected, solution2.searchRange(nums, target));
    }

    @Test
    void testTargetAtBeginning() {
        int[] nums = {1, 2, 3, 3, 3, 4};
        int target = 1;
        int[] expected = {0, 0};
        assertArrayEquals(expected, solution2.searchRange(nums, target));
    }

    @Test
    void testTargetAtEnd() {
        int[] nums = {1, 2, 3, 3, 3, 4};
        int target = 4;
        int[] expected = {5, 5};
        assertArrayEquals(expected, solution2.searchRange(nums, target));
    }

    @Test
    void testEmptyArray() {
        int[] nums = {};
        int target = 5;
        int[] expected = {-1, -1};
        assertArrayEquals(expected, solution2.searchRange(nums, target));
    }
}