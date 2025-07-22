class Solution {
    public void rotate(int[] arr, int k) {
        int n=arr.length;
        // k=k%n;
        //  for(int j=0;j<k;j++){
        //     int temp=arr[n-1];
        //     for(int i=n-1;i>=1;i--){
        //         arr[i]=arr[i-1];
        //     }
        //     arr[0]=temp;
        //  }
k%=n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);

    }
    public void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}