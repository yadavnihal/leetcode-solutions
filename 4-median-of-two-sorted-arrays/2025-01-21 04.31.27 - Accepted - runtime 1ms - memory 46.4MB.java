class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int idx1=0;
        int idx2=0;
        int x=0;
        int[] arr=new int[nums1.length+nums2.length];
        while(idx1<nums1.length &&idx2<nums2.length){
            if(nums1[idx1]<=nums2[idx2]){
                arr[x]=nums1[idx1];
                idx1++;
                x++;
            }
            else{
                arr[x]=nums2[idx2];
                idx2++;
                x++;
            } }
            while(idx1<nums1.length){
                arr[x]=nums1[idx1];
                idx1++;
                x++;
            }
            while(idx2<nums2.length ){
                arr[x]=nums2[idx2];
                idx2++;
                x++;
            }
        
        int n = arr.length;
        if (n % 2 == 0) {
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        } else {
            return arr[n / 2];
        }
        
    }
}