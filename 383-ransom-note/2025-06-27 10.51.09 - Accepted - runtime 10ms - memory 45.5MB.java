class Solution {
    public boolean canConstruct(String r, String m) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<m.length();i++){
            char c= m.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<r.length();i++){
            char ch=r.charAt(i);
            if(!map.containsKey(ch)) return false;
            if(map.get(ch)<=0) return false;
            map.put(ch,map.get(ch)-1);
        }
        return true;
    }
}