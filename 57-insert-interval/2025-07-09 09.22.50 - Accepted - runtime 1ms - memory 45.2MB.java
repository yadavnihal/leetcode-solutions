class Solution {
    public int[][] insert(int[][] arr, int[] newarr) {
List<int[]> res=new ArrayList<>();

int i=0;
    while(i<arr.length && arr[i][1]<newarr[0]){
        res.add(arr[i]);
        i++;
    }
    while(i<arr.length && arr[i][0]<=newarr[1]){
        newarr[0]=Math.min(newarr[0],arr[i][0]);
        newarr[1]=Math.max(newarr[1],arr[i][1]);
        i++;
    }
res.add(newarr);
while(i<arr.length){
    res.add(arr[i]);
    i++;
}

     
        return res.toArray(new int[res.size()][2]);
    }
}