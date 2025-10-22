class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1){
            return  nums[0];
        }
        int max=Integer.MIN_VALUE;
        int curr=0;
        for(int i=0;i<nums.length;i++){
            curr+=nums[i];
            max=Math.max(max,curr);
            if(curr<0){
                curr=0;
            }
        }
        return max;
    }
}