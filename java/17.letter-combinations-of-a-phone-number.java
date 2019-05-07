/*
 * @lc app=leetcode id=17 lang=java
 *
 * [17] Letter Combinations of a Phone Number
 *
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
 *
 * algorithms
 * Medium (39.04%)
 * Total Accepted:    379.4K
 * Total Submissions: 918.8K
 * Testcase Example:  '"23"'
 *
 * Given a string containing digits from 2-9 inclusive, return all possible
 * letter combinations that the number could represent.
 * 
 * A mapping of digit to letters (just like on the telephone buttons) is given
 * below. Note that 1 does not map to any letters.
 * 
 * 
 * 
 * Example:
 * 
 * 
 * Input: "23"
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * 
 * 
 * Note:
 * 
 * Although the above answer is in lexicographical order, your answer could be
 * in any order you want.
 * 
 */
class Solution {
    private static String[] dict = new String[]{"", "", "abc", "def", "ghi", "jkl","mno","pqrs", "tuv", "wxyz"};

    public void helper(String digits, List<String> ret, String temp, int digitsIndex) {
        if(digits.length() == temp.length()) {
            ret.add(temp);
            return;
        }
        int digit = Character.getNumericValue(digits.charAt(digitsIndex)) ;
        String letters = dict[digit];
        for(int i=0;i<letters.length();i++) {
            helper(digits, ret, temp + letters.charAt(i), digitsIndex + 1);
        }
    }


    public List<String> letterCombinations(String digits) {
        List<String> ret = new ArrayList<>();
        if(null == digits || 0 == digits.length()) {
            return ret;
        }
        helper(digits, ret, "", 0);
        return ret;
    }
}
