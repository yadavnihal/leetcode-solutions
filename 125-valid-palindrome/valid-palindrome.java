class Solution {
    public boolean isPalindrome(String s) {
        String ss=s.toLowerCase();
        String filter=ss.replaceAll("[^a-z0-9A-Z]", "");

        System.out.println(filter);
        for(int i=0;i<filter.length()/2;i++){
            if(filter.charAt(i)!=filter.charAt(filter.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}