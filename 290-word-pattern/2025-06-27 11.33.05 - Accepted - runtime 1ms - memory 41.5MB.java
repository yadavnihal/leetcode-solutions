class Solution {
    public boolean wordPattern(String pattern, String str) {
       char[] p=pattern.toCharArray(); 
        String[] s=str.split(" ");
        HashMap<Character,String> map=new HashMap<>();
        if(p.length!= s.length) return false;
        for(int i=0;i<p.length;i++){
            if(map.containsKey(p[i])){
                if(!map.get(p[i]).equals(s[i])) return false;
            }
            else{
                if(map.containsValue(s[i])) return false;
            }
            map.put(p[i],s[i]);
        }
        return true;
    }
}