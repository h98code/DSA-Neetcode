class Solution {
    public int[] twoSum(int[] a, int target) {
        int[] ans = new int[2];

        int st = 0, end = a.length - 1;

        while(st <= end){
            int sum = a[st] + a[end];

            if(sum > target){
                end--;
            }else if(sum < target){
                st++;
            }else{
                ans[0] = st + 1;
                ans[1] = end + 1;
                break;
            }
        }

        return ans;
    }
}
