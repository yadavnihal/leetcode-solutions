class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
       int min=Integer.MAX_VALUE;
       for(int i=l;i<=r;i++){
        int sum=0;
        if (i > nums.size()) break;

        for(int j=0;j<i;j++){
            sum+=nums.get(j);
        }
        if(sum>0) min=Math.min(min,sum);

        int curr=sum;
        for(int j=i;j<nums.size();j++){
curr+=nums.get(j)-nums.get(j-i);
 if(curr>0) min=Math.min(min,curr);

        }
       }
       if(min!=Integer.MAX_VALUE) return min;
       else return -1;
    }
}