class Solution {
    public int trap(int[] height) {
     int n=height.length;
int[] maxl=new int[height.length];
maxl[0]=height[0];
int[] maxR=new int[height.length];
maxR[n-1]=height[n-1];
        for(int i=1;i<height.length;i++){
            maxl[i]=Math.max(maxl[i-1],height[i]);
        }
        for(int i=n-2;i>=0;i--){
            maxR[i]=Math.max(maxR[i+1],height[i]);
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+(Math.min(maxl[i],maxR[i])-height[i]);
        }
        return sum;
    }
}