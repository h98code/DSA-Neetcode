class Solution {
    public String mergeAlternately(String w1, String w2) {
        StringBuilder s = new StringBuilder();

        int p1 = 0, p2 = 0;

        while(p1 < w1.length() || p2 < w2.length()) {
            if(p1 < w1.length()) s.append(w1.charAt(p1++));

            if(p2 < w2.length()) s.append(w2.charAt(p2++));
        }

        return s.toString();
    }
}