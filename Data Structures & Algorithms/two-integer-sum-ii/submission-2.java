class Solution {
    public int[] twoSum(int[] a, int target) {
        int l = 0, r = a.length - 1;

        while(l < r) {
            int sum = a[l] + a[r];

            if(sum == target) return new int[]{l + 1, r + 1};
            else if (sum < target) l++;
            else r--;
        }

        return new int[]{};
    }
}
