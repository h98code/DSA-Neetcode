class Solution {
    public int removeElement(int[] nums, int val) {
        // sorting algorithms 

        // use and extra array O(N) O(N)
        // two pointer and swap O(N) O(1)

        // EDGE case : no occurance / all occurance

        int ptr = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] != val) {
                nums[ptr++] = nums[i];
            }
        }

        return ptr;
    }
}