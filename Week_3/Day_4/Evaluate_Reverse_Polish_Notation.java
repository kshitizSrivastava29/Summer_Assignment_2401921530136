class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String s : tokens){
            
             if(s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*")){
               int num2 = st.pop();
               int temp = 0;
               if(s.equals("+"))temp = st.pop() + num2;
               else if(s.equals("-"))temp = st.pop() - num2;
               else if(s.equals("/"))temp = st.pop() / num2;
               else if(s.equals("*"))temp = st.pop() * num2;
               st.push(temp);
             }else{
               st.push(Integer.parseInt(s));
             }
        }
        return st.pop();
    }
}
