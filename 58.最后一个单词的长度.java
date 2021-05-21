/*
 * @lc app=leetcode.cn id=58 lang=java
 *
 * [58] 最后一个单词的长度
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        return test1(s);
    }

    /**
     * 从后往前遍历 获取到最后一个单词长度后 返回
     */
    public int test1(String s){
        int i = s.length() -1;
        int count = 0;
        
        while(i >= 0&&!Character.isLetter(s.charAt(i))) i--;
        while(i >= 0&&Character.isLetter(s.charAt(i--))) count++;

        return count;
    }
}
// @lc code=end

