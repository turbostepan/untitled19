package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testTwoSum_Case1() {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }

    @Test
    void testTwoSum_Case2() {
        Solution solution = new Solution();
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }

    @Test
    void testTwoSum_Case3() {
        Solution solution = new Solution();
        int[] nums = {3, 3};
        int target = 6;
        int[] expected = {0, 1};
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }

    @Test
    void testTwoSum_NoSolution() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3};
        int target = 7;
        int[] expected = {-1, -1};
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }

    @Test
    void testTwoSum_EmptyArray() {
        Solution solution = new Solution();
        int[] nums = {};
        int target = 10;
        int[] expected = {-1, -1};
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }
}