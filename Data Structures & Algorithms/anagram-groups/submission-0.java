class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        for (int i = 0; i < s.length(); i++) {
            if (sArr[i] != tArr[i]) {
                return false;
            }
        }

        return true;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        map.put(strs[0], new ArrayList<>(List.of(strs[0])));

        for (int i = 1; i < strs.length; i++) {
            boolean hasExist = false;
            for (String key : map.keySet()) {
                if (isAnagram(strs[i], key)) {
                    map.get(key).add(strs[i]);
                    hasExist = true;
                }
            }

            if (!hasExist) {
                map.put(strs[i], new ArrayList<>(List.of(strs[i])));
            }
        }

        return new ArrayList<>(map.values());
    }
}
