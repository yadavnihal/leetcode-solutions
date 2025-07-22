class Solution {
    public int search(int[] nums, int target) {
        int[] arr=new int[nums.length];
      
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]) return i;
        }
        return -1;
    }
}