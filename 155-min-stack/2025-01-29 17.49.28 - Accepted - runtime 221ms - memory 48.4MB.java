class MinStack {
ArrayList<Integer> st = new ArrayList<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        st.add(val);
    }
    
    public void pop() {
        if(st.size()==0) return;
        st.remove(st.size()-1);
    }
    
    public int top() {
         if(st.size()==0) return -1;
         return st.get(st.size()-1);
    }
    
    public int getMin() {
        if(st.size()==0) return -1;
        int min=st.get(0);
        for (int i : st) {
      if (i<min) min=i;
    }
    return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */