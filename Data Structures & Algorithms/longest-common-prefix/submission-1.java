class Solution {
    public String longestCommonPrefix(String[] strs) {
        // check for lcp of 2 strings and continue.

        // check for every char of the string, of all strings and add to lcp. 

        // lcp : "" / smallest string present in the array. 
        // len lcp : min - 0, max : lenMax
        // assuming the first string len to be the maxLen of the lcp

        StringBuilder ans = new StringBuilder();
        int len = Integer.MAX_VALUE;
        for(String str : strs) {
            len = Math.min(len, str.length());
        }

        if(len == 0) return "";

        for(int i = 0; i < len; i++) {

            Character ch = strs[0].charAt(i);

            for(int j = 0; j < strs.length; j++) {
                String str = strs[j];

                if(str == null || str.length() == 0) {
                    return "";
                }

                if(str.charAt(i) != ch) {
                    return ans.toString();
                }
            }

            ans.append(ch);
        }

        return ans.toString();
    }
}