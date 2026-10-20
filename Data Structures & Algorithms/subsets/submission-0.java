class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        // all the possible combinations 
        // use the pick non pick approach to make a subset

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        helper(nums, nums.length, ans, temp);

        return ans;
    }

    private void helper(int[] a, int n, List<List<Integer>> ans, List<Integer> temp) {
        if(n == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        helper(a, n - 1, ans, temp);

        temp.add(a[n - 1]);
        helper(a, n - 1, ans, temp);
        temp.remove(temp.size() - 1);
    }
}
