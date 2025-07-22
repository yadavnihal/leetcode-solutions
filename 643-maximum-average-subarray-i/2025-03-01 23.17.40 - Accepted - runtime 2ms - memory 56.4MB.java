class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int  max=0;

        for(int i=0;i<k;i++){
            max+=nums[i];
        }
        int res=max;

        for(int i=k;i<nums.length;i++){
            max+=nums[i];
            max-=nums[i-k];
            res=Math.max(max,res);
        }
        return (double)res/k;
    }
}