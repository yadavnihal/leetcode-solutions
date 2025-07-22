class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            int j = i;
            while (j < s.length()) {
                sb.append(s.charAt(j));
                int nextIndex = j + 2 * (numRows - 1 - i);
                if (i != 0 && i != numRows - 1 && nextIndex < s.length()) {
                    sb.append(s.charAt(nextIndex));
                }
                j += 2 * (numRows - 1);
            }
        }
        return sb.toString();
    }
}