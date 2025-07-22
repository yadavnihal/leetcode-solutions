class Solution {
    public int[] productExceptSelf(int[] nums) {
//         int prefix[] = new int[nums.length];
//         for(int i=0;i<nums.length;i++){
//             int mul=1;
//             for(int j=0; j<nums.length;j++){
//                 if(j!=i){
//                     mul=mul*nums[j];
//                 }}
//                 prefix[i]=mul;
            
//         }
// return prefix;
 int n= nums.length;
 int[] arr=new int[n];
 int[] prefix=new int[n];
 int[] suffix=new int[n];
 prefix[0]=1;
 suffix[n-1]=1;
 for(int i=1;i<n;i++){
    prefix[i]=prefix[i-1]*nums[i-1];
 }
 for(int i=n-2;i>=0;i--){
    suffix[i]=suffix[i+1]*nums[i+1];
 }
 for(int i=0;i<n;i++){
    arr[i]=prefix[i]*suffix[i];
 }
 return arr;
    }
}