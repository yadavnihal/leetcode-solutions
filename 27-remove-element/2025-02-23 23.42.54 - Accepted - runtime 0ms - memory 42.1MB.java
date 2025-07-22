class Solution {
    public int removeElement(int[] arr, int val) {
        if(arr.length==0) return 0;
        int size=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=val){
                arr[size]=arr[i];
                size++;
                
            }
        }

return size;
    }
}