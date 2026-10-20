class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s2.length() < s1.length()) return false;

        int[] fr1 = new int[26];
        int fr[] = new int[26];

        for(int i=0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            fr1[ch - 'a']++;
        }

        int k = s1.length();
        for(int i=0; i<s2.length(); i++){
            char ch = s2.charAt(i);
            fr[ch - 'a']++;  //adding the ch in the window
            if(i >= k) fr[s2.charAt(i - k) - 'a']--; //removing the leftmost ch of the window
            if(i >= k - 1) {
                if(Arrays.equals(fr, fr1)) return true;
            }
        }

        return false;
    }
}
