/*
 * @lc app=leetcode.cn id=151 lang=java
 *
 * [151] 翻转字符串里的单词
 */

// @lc code=start
class Solution {

    public String reverseWords(String s) {
        return test3(s);
    }

    /**
     * 字符串切割 + 倒叙反转
     */
    public String test1(String s){
        String[] array = s.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = array.length-1; i >= 0 ; i--) {
            if(array[i].isEmpty())continue;
            if(i!=array.length-1) builder.append(" ");
            builder.append(array[i]);
        }
        return builder.toString();
    }

    public String test2(String s){
        s = s.trim(); // 删除首尾空格
        int j = s.length() - 1, i = j;
        StringBuilder res = new StringBuilder();
        while(i >= 0) {
            while(i >= 0 && s.charAt(i) != ' ') i--; // 搜索首个空格
            res.append(s.substring(i + 1, j + 1) + " "); // 添加单词
            while(i >= 0 && s.charAt(i) == ' ') i--; // 跳过单词间空格
            j = i; // j 指向下个单词的尾字符
        }
        return res.toString().trim(); // 转化为字符串并返回
    }

    public String test3(String s){
        if (s == null) return null;
    
        char[] a = s.toCharArray();
        int n = a.length;
        
        // step 1. reverse the whole string
        reverse(a, 0, n - 1);
        // step 2. reverse each word
        reverseWords(a, n);
        // step 3. clean up spaces
        return cleanSpaces(a, n);
    }

    private void reverseWords(char[] a, int n) {
        int i = 0, j = 0;
          
        while (i < n) {
          while (i < j || i < n && a[i] == ' ') i++; // skip spaces
          while (j < i || j < n && a[j] != ' ') j++; // skip non spaces
          reverse(a, i, j - 1);                      // reverse the word
        }
      }
      
      // trim leading, trailing and multiple spaces
      private String cleanSpaces(char[] a, int n) {
        int i = 0, j = 0;
          
        while (j < n) {
          while (j < n && a[j] == ' ') j++;             // skip spaces
          while (j < n && a[j] != ' ') a[i++] = a[j++]; // keep non spaces
          while (j < n && a[j] == ' ') j++;             // skip spaces
          if (j < n) a[i++] = ' ';                      // keep only one space
        }
      
        return new String(a).substring(0, i);
      }
      
      // reverse a[] from a[i] to a[j]
      private void reverse(char[] a, int i, int j) {
        while (i < j) {
          char t = a[i];
          a[i++] = a[j];
          a[j--] = t;
        }
      }

}
// @lc code=end

