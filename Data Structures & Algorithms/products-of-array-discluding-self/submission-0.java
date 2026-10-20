class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        int[] suff = new int[nums.length];
        int n = nums.length;

        for(int i=0; i<nums.length; i++){
            if(i == 0){
                pre[i] = nums[i];
                suff[n - 1 - i] = nums[n - 1 - i];
            }else{
                pre[i] = nums[i] * pre[i-1];
                suff[n - 1 - i] = nums[n - 1 - i] * suff[n - i];
            }
        }

        for(int i=0; i<n; i++){
            if(i == 0){
                nums[i] = suff[i + 1];
            }else if(i == n - 1){
                nums[i] = pre[i - 1];
            }else{
                nums[i] = pre[i - 1] * suff[i + 1];
            }
        }
        
        return nums;
    }
}  
