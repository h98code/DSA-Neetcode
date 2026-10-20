class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> mp = new HashMap<>();

        for(String str : strs) {
            //sort the current string
            char[] s = str.toCharArray();
            Arrays.sort(s);
            String ss = new String(s);

            if(mp.containsKey(ss)) { // comparing 2 strings 
                mp.get(ss).add(str);
            } else {
                mp.put(ss, new ArrayList<String>(List.of(str)));
            }
        }

        for(List<String> value : mp.values()) {
            ans.add(value);
        }

        return ans;
    }
}
