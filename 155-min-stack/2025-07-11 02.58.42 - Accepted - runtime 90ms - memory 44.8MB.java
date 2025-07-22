class MinStack {
ArrayList<Integer> arr=new ArrayList<>();

    public MinStack() {
       

    }
    
    public void push(int val) {
        arr.add(val);
    }
    
    public void pop() {
        if(arr.size()!=0)
       arr.remove(arr.size()-1);
    }
    
    public int top() {
        
      return  arr.get(arr.size()-1);
      
    }
    
    public int getMin() {
    
     int min=Integer.MAX_VALUE;
     for(int i=0;i<arr.size();i++){
       min = Math.min(arr.get(i),min);
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