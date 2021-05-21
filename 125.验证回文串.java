
/*
 * @lc app=leetcode.cn id=125 lang=java
 *
 * [125] 验证回文串
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        return test2(s);
    }

    /**
     * 筛选字母与数字、进行回文判断
     */
    public boolean test1(String s) {
        StringBuilder sgood = new StringBuilder();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                sgood.append(Character.toLowerCase(ch));
            }
        }

        for (int i = 0, j = sgood.length() - 1; i < j; i++, j--) {
            if (sgood.charAt(i) != sgood.charAt(j))
                return false;
        }

        return true;
    }

    /**
     * 一层循环：两步合一
     */
    public boolean test2(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            while(i<j&&!Character.isLetterOrDigit(s.charAt(i))) i++;
            while(i<j&&!Character.isLetterOrDigit(s.charAt(j))) j--;
            if(i<j&&Character.toUpperCase(s.charAt(i++))!=Character.toUpperCase(s.charAt(j--))) return false;
        }
        return true;
    }


}
// @lc code=end
