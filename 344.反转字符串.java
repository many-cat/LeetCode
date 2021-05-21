/*
 * @lc app=leetcode.cn id=344 lang=java
 *
 * [344] 反转字符串
 */

// @lc code=start
class Solution {
    public void reverseString(char[] s) {
        test1(s);
    }

    public void test1(char[] s){
        for (int left = 0,right = s.length-1; left<right; left++,right--) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
        }
    }
}
// @lc code=end

