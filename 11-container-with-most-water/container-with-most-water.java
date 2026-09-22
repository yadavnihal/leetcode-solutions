class Solution {
    public int maxArea(int[] height) {
       int n=height.length;
       int st=0;
       int end=n-1;
       int max=0;
       while(st<end){
        int curr=end-st;
        int min=Math.min(height[st],height[end]);
       
        max=Math.max(max,curr*min);
        if(height[st]<=height[end]){
            st++;
        }
        else{
            end--;
        }
       }
       return max;
    }
}