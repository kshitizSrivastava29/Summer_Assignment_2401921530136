class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int x = 0;
        Deque<Integer> dq = new LinkedList<>();
        for(int i = 0 ; i < n ; i++){
            while(!dq.isEmpty() && nums[i] > nums[dq.peekLast()]){
                dq.pollLast();
            }
            dq.offerLast(i);
            while(!dq.isEmpty() && i - dq.peekFirst() + 1 > k){
                dq.pollFirst();
            }
            if(i >= k-1)ans[x++] = nums[dq.peekFirst()];
        }
        return ans;
    }
}
