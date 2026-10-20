class Solution {
    public int maxArea(int[] a) {
        int st = 0, end = a.length - 1;

        int ans = 0;

        while(st < end){
            ans = Math.max(ans, Math.min(a[st], a[end])*(end - st));

            if(a[st] <= a[end]) st++;
            else end--;
        }

        return ans;
    }
}
