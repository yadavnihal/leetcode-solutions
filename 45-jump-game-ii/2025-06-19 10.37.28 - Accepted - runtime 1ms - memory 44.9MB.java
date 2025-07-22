class Solution {
    public int jump(int[] nums) {
        int j=0;
        int r=0;
        int l=0;
        while(r<nums.length-1){
            int farthest=0;
            for(int i=l;i<r+1;i++){
                farthest=Math.max(farthest,i+nums[i]);
            }
            l=r+1;
            r=farthest;
            j++;
        }
        return j;
    }
}