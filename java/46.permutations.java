/*
 * @lc app=leetcode id=46 lang=java
 *
 * [46] Permutations
 *
 * https://leetcode.com/problems/permutations/description/
 *
 * algorithms
 * Medium (51.46%)
 * Total Accepted:    370.1K
 * Total Submissions: 675.4K
 * Testcase Example:  '[1,2,3]'
 *
 * Given a collection of distinct integers, return all possible permutations.
 * 
 * Example:
 * 
 * 
 * Input: [1,2,3]
 * Output:
 * [
 * ⁠ [1,2,3],
 * ⁠ [1,3,2],
 * ⁠ [2,1,3],
 * ⁠ [2,3,1],
 * ⁠ [3,1,2],
 * ⁠ [3,2,1]
 * ]
 * 
 * 
 */
class Solution {
    public void helper(List<List<Integer>> ret, List<Integer> temp, int[] nums, int[] arr) {
        if(temp.size() == nums.length){
            ret.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length; i++) {
            if(arr[i] == 1) 
                continue;
            temp.add(nums[i]);
            arr[i] = 1;
            helper(ret, temp, nums, arr);
            temp.remove(temp.size() - 1);
            arr[i] = 0;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        helper(ret, new ArrayList<>(), nums, new int[nums.length]);
        return ret;
    }
}
