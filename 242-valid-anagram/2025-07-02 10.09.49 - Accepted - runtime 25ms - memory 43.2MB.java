class Solution {
    public boolean isAnagram(String s, String t) {
        // if(s.length()!=t.length()) return false;
        // char[] sh=s.toCharArray();
        // char[] th=t.toCharArray();
        // HashMap<Character,Integer> smap=new HashMap<>();
        // HashMap<Character,Integer> tmap=new HashMap<>();
        // for(int i=0;i<sh.length;i++){
        //     smap.put(sh[i],smap.getOrDefault(sh[i],0)+1);
        // }
        // for(int i=0;i<th.length;i++){
        //     tmap.put(th[i],tmap.getOrDefault(th[i],0)+1);
        // }
        // for(char c: smap.keySet()){
        //     if(!tmap.containsKey(c)) return false;
        //     if(tmap.get(c)!=smap.get(c)) return false;
        // }
        // return true;
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            count.put(s.charAt(i), count.getOrDefault(s.charAt(i), 0) + 1);
            count.put(t.charAt(i), count.getOrDefault(t.charAt(i), 0) - 1);
        }

        for (int val : count.values()) {
            if (val != 0) return false;
        }
        return true;
    }
} 