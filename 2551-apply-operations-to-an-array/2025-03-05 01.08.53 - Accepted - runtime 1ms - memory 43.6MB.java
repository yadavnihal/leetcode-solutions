class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                nums[i-1]*=2;
                nums[i]=0;
            }
        }
        int left=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[left];
                nums[left]=temp;
                left++;
            }
        }
        return nums;
    }
}