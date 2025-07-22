class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> lst = new ArrayList<>();
        if (strs == null || strs.length == 0)
            return lst;

        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);

        }

         for (String key : map.keySet()) {
            lst.add(map.get(key));
        }
        return lst;
    }
}
