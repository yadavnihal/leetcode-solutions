class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int min=Integer.MAX_VALUE;
        int l=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            while(sum>=target){
                min=Math.min(min,i-l+1);
                sum-=arr[l];
                l++;
            }
        }
        if(min==Integer.MAX_VALUE) return 0;
        else return min;
    }
}