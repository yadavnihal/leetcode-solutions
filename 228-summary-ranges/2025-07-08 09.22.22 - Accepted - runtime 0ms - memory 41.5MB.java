class Solution {
    public List<String> summaryRanges(int[] nums) {

        List<String> l = new ArrayList<String>();
        
        for(int i=0;i<nums.length;i++){
            StringBuilder sb=new StringBuilder();
            int start = nums[i];
            while(i+1<nums.length && nums[i+1]-nums[i]==1){
                i++;
            }
            if(start!=nums[i]){
                sb.append(start);
                sb.append("->");
                sb.append(nums[i]);
                l.add(sb.toString());

            }
            else{
                  sb.append(nums[i]);
                l.add(sb.toString());
            }
        }
        
        return l;
    }
}