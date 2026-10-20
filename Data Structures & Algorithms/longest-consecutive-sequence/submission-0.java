class Solution {
    public int longestConsecutive(int[] nums) {
        // sort the array and check for the longest sequence
        // store the numbers in a set and check for the temp sequence and store the ans

        Set<Integer> s = new HashSet<>();
        int ans = 0;

        for(int el : nums) {
            s.add(el);
        }

        for(Integer key : s) {
            if(!s.contains(key + 1)) {

                int count = 0;

                while(s.contains(key)) {
                    count++;
                    key--;
                }

                ans = Math.max(ans, count);

            }
        }

        return ans;
    }
}
