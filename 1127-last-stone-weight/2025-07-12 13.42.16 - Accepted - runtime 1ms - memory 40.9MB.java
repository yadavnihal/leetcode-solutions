class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list=new ArrayList<>();
        for(int stone : stones){
            list.add(stone);
        }
        while(list.size() >1){
            Collections.sort(list);
            int y = list.remove(list.size()-1);
            int x = list.remove(list.size()-1);
            if (y != x){
                list.add(y-x);

            }
        } return list.isEmpty() ? 0 : list.get(0);
        
    }
}