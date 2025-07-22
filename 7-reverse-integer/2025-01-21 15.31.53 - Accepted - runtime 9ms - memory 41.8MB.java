class Solution {
    public int reverse(int x) {
        String s = Integer.toString(x);
        boolean negative=false;
        if (s.charAt(0)=='-'){
            negative=true;
            s=s.substring(1,s.length());
        }
            s=s.substring(0,s.length());
            String reversed = "";
for (int i = s.length() - 1; i >= 0; i--) {
    reversed += s.charAt(i);
}

    try {
            int rev = Integer.parseInt(reversed);
            return negative ? -rev : rev;
        } catch (NumberFormatException e) {
        
            return 0;
        }
    }
}