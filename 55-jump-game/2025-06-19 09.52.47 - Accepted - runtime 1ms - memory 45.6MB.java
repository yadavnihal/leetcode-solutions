class Solution {
    public boolean canJump(int[] arr) {
     int fp=arr.length-1;
     for(int i=arr.length-2;i>=0;i--){
        if(arr[i]+i>=fp) fp=i;

     }
     return fp==0;
    }
}