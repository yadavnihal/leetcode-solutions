class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n=asteroids.length;
        Stack<Integer> stk =new Stack<>();
        for(int i=0;i<n;i++){
            if(asteroids[i]>=0){
                stk.push(asteroids[i]);
            }
            else{
                while(stk.size()>0 && stk.peek()>=0 && stk.peek()<Math.abs(asteroids[i])){
                    stk.pop();
                }
                if(stk.size()>0 && stk.peek()>=0 && stk.peek()==Math.abs(asteroids[i])){
                    stk.pop();
                }
                else if(stk.size()>0 && stk.peek()>=0 && stk.peek()>=Math.abs(asteroids[i])){

                }
                else{
                    stk.push(asteroids[i]);
                }
            }
        }
        int arr[]=new int[stk.size()];
        int i=stk.size()-1;
        while(!stk.isEmpty()){
            arr[i]=stk.peek();
            stk.pop();
            i--;
        }
        return arr;
    }
}