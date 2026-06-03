class Solution {
    public int[] sortedSquares(int[] nums) {
       int right = nums.length-1;
       int left = 0;
       int[] ans = new int[nums.length];
       int lIdx = 0;
       int rIdx = nums.length-1;
       while(left <= right){
          if(nums[left]*nums[left] < nums[right]*nums[right]){
            ans[rIdx--] = nums[right]*nums[right];
            right--;
          }else{
            ans[rIdx--] = nums[left]*nums[left];
            left++;
          }
       }
       return ans;
    }
}
