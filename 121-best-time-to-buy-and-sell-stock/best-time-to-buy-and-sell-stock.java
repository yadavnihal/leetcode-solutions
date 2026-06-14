class Solution {
    public int maxProfit(int[] prices) {
        Stack<Integer> st=new Stack<>();
        int max=0;
        st.push(0);
        for(int i=prices.length-1;i>=0;i--){
            if(st.peek()>=prices[i]){
                max=Math.max(max,st.peek()-prices[i]);
            }else{
                st.push(prices[i]);
            }
        }
        return max;
    }
}