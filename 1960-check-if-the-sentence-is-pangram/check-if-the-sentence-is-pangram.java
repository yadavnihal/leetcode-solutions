class Solution {
    public boolean checkIfPangram(String str) {
          str=str.toLowerCase();
       boolean[] flag=new boolean[26];
       int count=0;
       
       for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z'){
                int ind=ch-'a';
                if(!flag[ind]){
                    flag[ind]=true;
                    count++;
                }
            }
       } 
       if(count==26){
        return true;
       }
       else{
        return false;
       }
    }
}