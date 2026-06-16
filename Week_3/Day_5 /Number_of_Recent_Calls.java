class RecentCounter {
    Queue<Integer> q1 ;
    public RecentCounter() {
        q1 = new LinkedList<>();
    }
    
    public int ping(int t) {
        while(!q1.isEmpty() && q1.peek() < t - 3000){
            q1.remove();
        }
        q1.add(t);
        return q1.size();
    }
}
