// class Solution {
//     public Boolean isContains(int[] nums,int key){
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==key) return true;
//         }
//         return false;
//     }

//     public int firstMissingPositive(int[] nums) {
//         if(nums==null) return 1;
//         int max=nums[0];
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]>max) max=nums[i];
//         }
//         if(max<0) return 1;
        
//         for(int i=1;i<max;i++){
//             if(!isContains(nums,i)) return i;
//         }
//     return max+1;
//     }
// }

import java.util.HashSet;

class Solution {
    public int firstMissingPositive(int[] nums) {
        if (nums == null || nums.length == 0) return 1;
        
        HashSet<Integer> set = new HashSet<>();
        int max = 0;

        
        for (int num : nums) {
            if (num > 0) {
                set.add(num);
                max = Math.max(max, num);
            }
        }

     
        for (int i = 1; i <= max; i++) {
            if (!set.contains(i)) return i;
        }

        return max + 1;
    }
}
