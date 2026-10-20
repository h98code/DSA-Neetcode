class Solution {
    public int trap(int[] h) {
        // water stored = min(maxR, maxL) - currH
        // store in ararys --> O(N) O(N)

        // to reduce the extra space, we can increase the number of ptrs.

        int lmax = h[0], rmax = h[h.length - 1];
        int l = 0, r = h.length - 1;
        int ans = 0;

        while(l < r) {
            lmax = Math.max(lmax, h[l]);
            rmax = Math.max(rmax, h[r]);

            ans += (lmax <= rmax) ? lmax - h[l++] : rmax - h[r--];
        }
        
        return ans;
    }
}
