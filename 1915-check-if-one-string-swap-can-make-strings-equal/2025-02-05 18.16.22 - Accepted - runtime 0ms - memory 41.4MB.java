class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) return true;

        int diffCount = 0;
        int[] diffIndices = new int[2];

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (diffCount == 2) return false; 
                diffIndices[diffCount++] = i;
            }
        }

        return diffCount == 2 && 
               s1.charAt(diffIndices[0]) == s2.charAt(diffIndices[1]) &&
               s1.charAt(diffIndices[1]) == s2.charAt(diffIndices[0]);
    }
}