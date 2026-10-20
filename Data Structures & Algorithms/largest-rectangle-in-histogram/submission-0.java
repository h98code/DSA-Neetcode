class Solution {
    public int largestRectangleArea(int[] heights) {
        // (nsei - psei - 1) * curr height

        Stack<Integer> stk = new Stack<>(); // store the nsei and psei of the elements 
        int ans = 0;

        for(int i=0; i<=heights.length; i++) {

            int curr = (i == heights.length) ? 0 : heights[i];

            while(!stk.isEmpty() && heights[stk.peek()] > curr) {
                int nsei = i;
                int el = heights[stk.pop()];
                int psei = stk.isEmpty() ? -1 : stk.peek();
                ans = Math.max(ans, (nsei - psei - 1) * el);
            }

            stk.push(i);
        }

        return ans;
    }
}
