class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxSum=nums[0];
        int currSum = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                currSum+=nums[i];
            }
            else{
                maxSum=Math.max(currSum,maxSum);
                currSum=nums[i];
            }
        }
        return Math.max(currSum,maxSum);
    }
}