class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > map.getOrDefault(ans, 0)) {
                ans = num;
            }
        }

        return ans;
    }
}