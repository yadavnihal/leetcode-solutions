class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int val=arr[0];
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(val<=arr[i]){
                index=i;
            }
            val=Math.max(val,arr[i]);
        }
        return index;
    }
}