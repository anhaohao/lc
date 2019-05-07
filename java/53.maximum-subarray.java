/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 *
 * https://leetcode.com/problems/maximum-subarray/description/
 *
 * algorithms
 * Easy (41.84%)
 * Total Accepted:    515.4K
 * Total Submissions: 1.2M
 * Testcase Example:  '[-2,1,-3,4,-1,2,1,-5,4]'
 *
 * Given an integer array nums, find the contiguous subarray (containing at
 * least one number) which has the largest sum and return its sum.
 * 
 * Example:
 * 
 * 
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * 
 * 
 * Follow up:
 * 
 * If you have figured out the O(n) solution, try coding another solution using
 * the divide and conquer approach, which is more subtle.
 * 
 */
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        int currentSum = nums[0], maxSum = nums[0];
        for(int i = 1;i<nums.length;i++) {
            int n = nums[i];
            if(n + currentSum < 0) {
                currentSum = n;
            } else {
                if(currentSum < 0 && n > 0) {
                    currentSum = n;
                } else {
                    currentSum += n;
                }
            }
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
