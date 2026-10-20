class Solution {
    public boolean hasDuplicate(int[] nums) {
        // 2 for loops
        // sort and check
        /// store values in a set

        Set<Integer> s = new HashSet<>();

        for(int el : nums) {
            if(s.contains(el)) return true;
            s.add(el);
        }

        return false;
    }
}