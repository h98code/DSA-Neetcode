class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s2.length() < s1.length()) return false;

        String anagS1 = anagram(s1);
        int k = s1.length();

        int fr[] = new int[26];

        for(int i=0; i<s2.length(); i++){
            char ch = s2.charAt(i);

            if(i < k - 1) {
                fr[ch - 'a']++;
            } else {
                //adding the char in the window
                fr[ch - 'a']++;

                //checking the current window
                String anagS2 = Arrays.toString(fr);
                if(anagS1.equals(anagS2)) return true;

                //removing the count of leftmost el of the window
                fr[s2.charAt(i + 1 - k) - 'a']--;
            }
        }

        return false;
    }

    private String anagram(String s) {
        int[] fr = new int[26];

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            fr[ch - 'a']++;
        }

        return Arrays.toString(fr);
    }
}
