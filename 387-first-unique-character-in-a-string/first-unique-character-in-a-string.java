class Solution {
    public int firstUniqChar(String s) {
        // int[] freq=new int[26];
        // for(int i=0;i<s.length();i++){
        //     char c=s.charAt(i);
        //     freq[c-'a']++;
        // }
        // for(int i=0;i<s.length();i++){
        //     char c=s.charAt(i);
        //     if(freq[c-'a']==1) return i;

        // }
        // return -1;

        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);

        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1) return i;
        }
        return -1;
    }
}