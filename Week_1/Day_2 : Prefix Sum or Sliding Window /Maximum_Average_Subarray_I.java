class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0 ; 
        double max = Integer.MIN_VALUE;
        for(int i = 0 ; i < k ; i++){
          sum += nums[i];
        }
        int sIdx = 0;
        max = Math.max(max ,(double) sum /k);
        for(int i = k ; i < nums.length ; i++){
            sum += nums[i] - nums[sIdx++];
            max = Math.max(max ,(double) sum / k);
        }
return max;

    }
}
