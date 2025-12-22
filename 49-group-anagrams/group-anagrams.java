class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> lst=new ArrayList<>();
        if(strs.length==0) return lst;
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] chars=strs[i].toCharArray();
            Arrays.sort(chars);
          String key = new String(chars);

            if(!map.containsKey(key )){
map.put(key,new ArrayList<>());
            }
            map.get(key).add(strs[i]);
        }
        for(String key: map.keySet()){
            lst.add(map.get(key));
        }
        return lst;

    }
}