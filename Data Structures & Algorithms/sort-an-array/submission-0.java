class Solution {
    public int[] sortArray(int[] nums) {

        int n = nums.length - 1;

        // selection 
        for(int i=n; i>0; i--) {

            int max_index = i;

            for(int j=0; j<=i; j++) {
                if(nums[j] > nums[max_index]) {
                    max_index = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[max_index];
            nums[max_index] = temp;
        }

        return nums;
    }
}