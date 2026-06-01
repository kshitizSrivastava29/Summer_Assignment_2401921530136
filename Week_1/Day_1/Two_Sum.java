import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
       int idx1 = -1;
       int idx2 = -1;
       HashMap<Integer,Integer> map = new HashMap<>();
      for(int i = 0 ; i < nums.length ; i++){
        if(map.containsKey(target-nums[i])){
            idx1 = map.get(target-nums[i]);
            idx2 = i;
        }
        map.put(nums[i],i);
        
      }
      int ans[] = {idx1,idx2};
      return ans; 
    }
}
