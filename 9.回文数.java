/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        return test2(x);
    }

    /**
     * 转String后 双指针对比
     */
    public boolean test1(int x) {
        String num = Integer.toString(x);
        for (int i = 0, j = num.length() - 1; i < j; i++, j--) {
            if (num.charAt(i) != num.charAt(j))
                return false;
        }
        return true;
    }

    public boolean test2(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0))
            return false;
        int res = 0;
        while (x > res) {
            res = res * 10 + x % 10;
            x = x / 10;
        }
        return (x == res || x == res / 10);
    }

}
// @lc code=end
