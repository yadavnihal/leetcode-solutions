class Solution {
    public String reverseWords(String s) {
        String s2=s.trim().replaceAll("\\s+"," ");
        String[] words=s2.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]);
            if(i!=0) sb.append(" ");
        }
        return sb.toString();
    }
}