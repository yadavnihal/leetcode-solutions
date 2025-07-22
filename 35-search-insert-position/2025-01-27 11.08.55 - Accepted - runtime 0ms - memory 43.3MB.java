class Solution {
    public int searchInsert(int[] nums, int target) {
        int out=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target) out=i;
        }
       if (out==0){
        for(int i=0;i<nums.length;i++){
            if(nums[i]<target) out++;
        }}
        return out;
       
    }
}