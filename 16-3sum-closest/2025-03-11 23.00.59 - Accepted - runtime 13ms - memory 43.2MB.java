class Solution {
    public int threeSumClosest(int[] nums, int target) {
      Arrays.sort(nums);
      
     
      int sum=nums[0]+nums[1]+nums[2];
      int diffSum=Integer.MAX_VALUE;
      for(int i=0;i<nums.length-2;i++){
        int left=i+1;
        int right=nums.length-1;
        while(left<right){
        int currSum=nums[i]+nums[left]+nums[right];
        if(currSum==target) return currSum;
        if(currSum<target) left++;
        else right--;
        
        int diffcurrSum=Math.abs(target-currSum);
        if(diffcurrSum<diffSum){
            sum=currSum;
            diffSum=diffcurrSum;
        }
      }}
    
    return sum;    
    }
}