class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> map=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            map.add(nums[i]);
        }
        int max=0;
        for(int curr: map){


            int count=0;
            if(!map.contains(curr-1)){
                
            while(map.contains(curr)){
                count++;
                curr++;
            }
            max=Math.max(count,max);}
        }
    
        return max;
    }
}