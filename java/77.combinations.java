/*
 * @lc app=leetcode id=77 lang=java
 *
 * [77] Combinations
 *
 * https://leetcode.com/problems/combinations/description/
 *
 * algorithms
 * Medium (44.47%)
 * Total Accepted:    198.3K
 * Total Submissions: 419.6K
 * Testcase Example:  '4\n2'
 *
 * Given two integers n and k, return all possible combinations of k numbers
 * out of 1 ... n.
 * 
 * Example:
 * 
 * 
 * Input: n = 4, k = 2
 * Output:
 * [
 * ⁠ [2,4],
 * ⁠ [3,4],
 * ⁠ [2,3],
 * ⁠ [1,2],
 * ⁠ [1,3],
 * ⁠ [1,4],
 * ]
 * 
 * 
 */
class Solution {
    private void helper(int n, int k, List<List<Integer>> ret, List<Integer> temp, int index) {
        if(temp.size() == k) {
            ret.add(new ArrayList<>(temp));
            return;
        }

        for(int i=index;i<n;i++) {
            temp.add(i+1);
            helper(n,k,ret,temp, ++index);
            temp.remove(temp.size() - 1);
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ret = new ArrayList<>();
        helper(n,k,ret,new ArrayList<>(), 0);
        return ret;
    }
}
