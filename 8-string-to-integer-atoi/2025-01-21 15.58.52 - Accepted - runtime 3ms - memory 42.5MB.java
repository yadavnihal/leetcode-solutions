class Solution {
    public int myAtoi(String s) {
        boolean negative = false;
        
        s = s.trim();
        
        if (s.isEmpty()) {
            return 0;
        }

        int start = 0;
        if (s.charAt(0) == '-') {
            negative = true;
            start++;
        } else if (s.charAt(0) == '+') {
            start++;
        }

        StringBuilder c = new StringBuilder();
        for (int i = start; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                c.append(s.charAt(i));
            } else {
                break;
            }
        }

        if (c.length() == 0) {
            return 0;
        }

        try {
            int k = Integer.parseInt(c.toString());
            if (negative) {
                k = -k;
            }
            return k;
        } catch (NumberFormatException e) {
            return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
    }
}
