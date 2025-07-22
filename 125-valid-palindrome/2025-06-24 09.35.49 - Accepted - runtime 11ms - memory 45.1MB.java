class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.trim();
        s = s.replaceAll(" ", "");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }

        StringBuilder sb2 = new StringBuilder();
        for (int i = sb.length() - 1; i >= 0; i--) {
            sb2.append(sb.charAt(i));
        }

        return sb.toString().equals(sb2.toString());
    }
}