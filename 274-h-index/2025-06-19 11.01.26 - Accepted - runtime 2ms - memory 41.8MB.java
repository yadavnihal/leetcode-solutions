class Solution {
    public int hIndex(int[] arr) {
        Arrays.sort(arr);
        int h=0;
       
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=arr.length-i) {
            h=Math.max(h,arr.length-i);
            break;
            }
        }
        return h;
    }
}