class Solution {
    public int lengthOfLongestSubstring(String s) {

        int ans = 0;

        //map to store the char and index
        Map<Character, Integer> mp = new HashMap<>();
        int l = 0;

        for(int index = 0; index < s.length(); index++){
            char ch = s.charAt(index);

            if(mp.containsKey(ch)){
                l = Math.max(l, mp.get(ch) + 1);
            }

            mp.put(ch, index);
            
            // System.out.print(index + " " + l);
            // System.out.println();
            ans = Math.max(ans, index - l + 1);
        }

        return ans;
    }
}
