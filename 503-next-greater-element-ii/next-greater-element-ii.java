class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] arr=new int[nums.length];
      int n=nums.length;
      for(int i=0;i<n;i++){
        arr[i]=-1;
      }
        Stack<Integer> st=new Stack<>();
        // HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=2*n-1;i>=0;i--){
            while(st.size()>0 && nums[st.peek()]<=nums[i%n]){
                st.pop();
            }
            if(st.isEmpty()){
                arr[i%n]=-1;
            }else{
                arr[i%n]=nums[st.peek()];
            }
            st.push(i%n);
        }
        
        return arr;
    }
}