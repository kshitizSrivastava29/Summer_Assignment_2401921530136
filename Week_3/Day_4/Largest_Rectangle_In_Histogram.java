class Solution {
    public int largestRectangleArea(int[] heights) {
        int ans = 0;
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < n ; i++){
            while(!st.isEmpty() && heights[i] <= heights[st.peek()]){
                int ht = heights[st.pop()];
                int pse = -1;
                if(!st.isEmpty())pse = st.peek();
                int area = ht * (i - pse - 1); 
                ans = Math.max(area,ans);
            }
            st.push(i);
        }

        while(!st.isEmpty()){
             int ht = heights[st.pop()];
             int pse = -1;
             if(!st.isEmpty())pse = st.peek();
             int area = ht * (n - pse - 1);
             ans = Math.max(area,ans);
        }
        return ans;
    }
}
