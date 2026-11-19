class Solution {
    public void sortColors(int[] nums) {
        // sort array of 0 1 and 2's 
        // sorting algo : O(N^2) || O(N logN)
        // create another array of the same size and insert 0 1 and 2 : O(3N) O(N)
        // count the number of 0's 1's and 2's and populate the same array O(2N) O(1)
        // similar to partition technique of the quick sort, move 0's and 2's.

        // if 0 found -> swap it towards the start of the array
        // if 2 found -> swap it towards the end of the array
        // if 1 found -> continue

        int zp = 0, tp = nums.length - 1;

        for(int op = 0; op <= tp; op++) {
            if(nums[op] == 0) {
                int temp = nums[op];
                nums[op] = nums[zp];
                nums[zp] = temp;
                zp++;
            } else if(nums[op] == 1) {
                continue;
            } else {
                int temp = nums[tp];
                nums[tp] = nums[op];
                nums[op] = temp;
                tp--;
                op--;
            }
        }
    }
}