class Solution {
    public int majorityElement(int[] nums) {
        // count the frequency using for loops 
        // sort and find the mid element 
        // store the freq using maps 

        // freq of ME - freq other elements > 0

        int count = 0;
        int me = -1;

        for(int el : nums) {
            if(count == 0) {
                me = el;
                count = 1;
            } else {
                count = el == me ? count + 1 : count - 1;
            }
        }

        return me;
    }
}