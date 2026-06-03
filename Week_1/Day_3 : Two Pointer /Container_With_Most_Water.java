class Solution {
    public int maxArea(int[] height) {
        int lMax = 0;
        int rMax = 0;
        int left = 0;
        int right = height.length-1;
        int ans = 0;
        while(left < right){
            lMax = Math.max(lMax,height[left]);
            rMax = Math.max(rMax,height[right]);

            ans = Math.max(ans , Math.min(lMax,rMax) * (right-left));

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return ans;
    }
}
