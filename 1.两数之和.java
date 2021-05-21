import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {


    public int[] twoSum(int[] nums, int target) {    
        return hash(nums,target);
    }

    /**
     * 双层for 暴力求解
     */
    public int[] violence(int[] nums, int target){
        for(int i=0;i<nums.length -1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }

    /**
     * 通过HASH 进行求解
     */
    public int[] hash(int[] nums, int target){
        Map<Integer,Integer> hashTable = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hashTable.containsKey(target-nums[i])){
                return new int[]{i,hashTable.get(target-nums[i])};
            }
            hashTable.put(nums[i], i);
        }
        return new int[0];
    }
}
// @lc code=end

