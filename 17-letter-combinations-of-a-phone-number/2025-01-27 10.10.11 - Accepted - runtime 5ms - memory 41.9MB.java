class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) return new ArrayList<>();

        String[] mapping = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
        
        List<String> result = new ArrayList<>();
        result.add(""); // Start with an empty combination

        for (char digit : digits.toCharArray()) {
            List<String> temp = new ArrayList<>();
            String letters = mapping[digit - '0'];
            
            for (String combination : result) {
                for (char letter : letters.toCharArray()) {
                    temp.add(combination + letter);
                }
            }
            result = temp; 
        }

        return result;
    }
}
