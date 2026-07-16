class Solution {
    public String longestCommonPrefix(String[] strs) {
        String first = strs[0];
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < first.length(); i++) {
            boolean isEqual = true;
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length()) {
                    return ans.toString();
                }
                if (first.charAt(i) != strs[j].charAt(i)) {
                    isEqual = false;
                    break;
                }
            }
            if (isEqual) {
                ans.append(first.charAt(i));
            } else {
                return ans.toString();
            }
        }

        return ans.toString();
    }
}