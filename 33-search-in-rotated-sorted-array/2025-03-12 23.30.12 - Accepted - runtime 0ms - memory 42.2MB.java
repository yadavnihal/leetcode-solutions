class Solution {
    public int search(int[] nums, int target) {
        // int[] arr=new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     if(target==nums[i]) return i;
        // }
        // return -1;
    int st=0;
    int end=nums.length-1;
    while(st<=end){
        int mid=st+(end-st)/2;
        if(target==nums[mid]) return mid;
        if(nums[st]<=nums[mid]){
            if(nums[st]<=target && target<=nums[mid]) end=mid-1;
            else st=mid+1;
        }
        else{
            if(nums[mid]<=target && target<=nums[end]) st=mid+1;
            else end=mid-1;
        }
    }
return -1;
    }
}