class Solution {
    public int timeRequiredToBuy(int[] arr, int k) {
        // int c = 0;
        // int i = 0;
        // while (arr[k] != 0) {
        //     if (i == arr.length)
        //         i = 0;
        //     while (arr[i] == 0) {
        //         i++;
        //         if (i == arr.length)
        //             i = 0;
        //     }
        //     arr[i] = arr[i] - 1;
        //     i++;

        //     c++;
        // }
        // return c;
        int t=0;
        for(int i=0;i<arr.length;i++){
            if(i<=k){
                t+=Math.min(arr[i],arr[k]);
            }else{
                t+=Math.min(arr[i],arr[k]-1);

            }
        }
        return t;
    }
}