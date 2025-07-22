class Solution {
    public int[] closestPrimes(int left, int right) {
        List<Integer> arr=new ArrayList<>();
        for(int i=left;i<=right;i++){
            int flag=0;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0 && i>1){
                arr.add(i);
            }
        }
        if (arr.size() < 2) {
            return new int[]{-1, -1};
        }
        
        int[] arr2 = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            arr2[i] = arr.get(i);
        }
       int close=Integer.MAX_VALUE;
       int[] res={-1,-1};
       for(int i=1;i<arr2.length;i++){
        int currclose=arr2[i]-arr2[i-1];
        if(currclose<close){
            res[0]=arr2[i-1];
            res[1]=arr2[i];
            close=currclose;
        }
      
       }
        return res;
    }
}