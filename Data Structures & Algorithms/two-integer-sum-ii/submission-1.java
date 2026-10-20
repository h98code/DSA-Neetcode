class Solution {
    public int[] twoSum(int[] nums, int target) {
        int st = 0, end = nums.length - 1;

        while(st < end) {
            int sum = nums[st] + nums[end];

            if(sum == target) {
                return new int[] {st + 1, end + 1};
            } else if (sum < target) {
                st++;
            } else {
                end--;
            }
        }

        return new int[]{};
    }
}
