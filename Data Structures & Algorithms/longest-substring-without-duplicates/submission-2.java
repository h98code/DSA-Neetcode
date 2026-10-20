class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        int ans = 0;
        int left = 0;

        for(int i=0; i<s.length(); i++) {
            char curr = s.charAt(i);

            if(mp.containsKey(curr) && mp.get(curr) >= left) { // move only if the duplicate is found in the current window
                left = mp.get(curr) + 1;
            }

            mp.put(curr, i);
            ans = Math.max(ans, i - left + 1);
        }

        return ans;
    }
}
