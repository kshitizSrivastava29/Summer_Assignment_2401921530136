class MyQueue {
    Stack<Integer> q1 ;
    public MyQueue() {
        q1 = new Stack<>();
    }
    
    public void push(int x) {
        if(empty()){
            q1.push(x);
            return;
        }
        int temp = q1.pop();
        push(x);
        q1.push(temp);
    }
    
    public int pop() {
        if(empty()){
            return -1;
        }
        int temp = q1.pop();
        return temp;
    }
    
    public int peek() {
        if(empty()){
            return -1;
        }
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
