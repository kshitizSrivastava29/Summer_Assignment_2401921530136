class Info{
        int val;
        int min;
        Info(int val , int min){
            this.val = val;
            this.min = min;
        }
    }
class MinStack {
    Stack<Info> st ;
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        if(st.isEmpty()){
            st.push(new Info(val,val));
            return;
        }
        st.push(new Info(val,Math.min(val,st.peek().min)));
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek().val;
    }
    
    public int getMin() {
        return st.peek().min;
    }
}
