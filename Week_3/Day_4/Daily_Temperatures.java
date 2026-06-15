class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> st = new Stack<>(); //to store index
        
        for(int i = 0 ; i < n ; i++){

            while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()]){
                int prev = st.pop();
                temperatures[prev] = i - prev; 
            }
            st.push(i);   
        }
        while(!st.isEmpty()){
            temperatures[st.pop()] = 0;
        }
        return temperatures;
    }
}
