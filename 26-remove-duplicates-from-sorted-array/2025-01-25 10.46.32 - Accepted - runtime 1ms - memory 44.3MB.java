class Solution {
    public int removeDuplicates(int[] nums) {
       if(nums.length==0) return 0;
       int size=1;
       for(int i=0;i<nums.length;i++){
        if(nums[i]!=nums[size-1]){
            nums[size]=nums[i];
            size++;
        }
       }
        return size;
    }
}