/*
 * @lc app=leetcode.cn id=1108 lang=java
 *
 * [1108] IP 地址无效化
 */

// @lc code=start
class Solution {
    public String defangIPaddr(String address) {
        return test1(address);
    }
     
    /**
     * 直接遍历 替换
     */
    public String test1(String address){
        char[] array = address.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if(array[i] == '.'){
                result.append("[.]");
            }else{
                result.append(array[i]);
            }
        }
        return result.toString();
    }


}
// @lc code=end

