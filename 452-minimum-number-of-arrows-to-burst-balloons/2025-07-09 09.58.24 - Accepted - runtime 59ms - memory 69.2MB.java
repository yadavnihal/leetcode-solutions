class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,Comparator.comparingInt(i->i[0]) );
        int count=1;
int[] prev=points[0];
for(int i=0;i<points.length;i++){
    int prevs=prev[0];
    int preve=prev[1];
    int currs=points[i][0];
    int curre=points[i][1];
    if(preve<currs){
    prev=points[i];
    count++;
}
else{
    prev[0]=Math.min(prevs,currs);
    prev[1]=Math.min(preve,curre);
}
}
return count;
    }
}