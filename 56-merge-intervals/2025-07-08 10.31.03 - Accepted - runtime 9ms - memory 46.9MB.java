class Solution {
    public int[][] merge(int[][] arr ){
        List<int[]> res=new ArrayList<>();

    Arrays.sort(arr,Comparator.comparingInt(i->i[0]));
        for(int i=0;i<arr.length;i++){
            int start=arr[i][0];
            int end=arr[i][1];
            while(i+1<arr.length && end>=arr[i+1][0]){
                // if(arr[i+1][0]<start) start=arr[i+1][0];
                if(end<arr[i+1][1]){
                end=arr[i+1][1];
                }
                i++;
            }
            int[] curr ={start,end};
            res.add(curr);
        }
        return res.toArray(new int[res.size()][2]);
    }
}