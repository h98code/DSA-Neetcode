class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> mp = new HashMap<>();

        for(String str : strs) {
            int[] fr = new int[26];

            for(int i=0; i<str.length(); i++){
                fr[str.charAt(i) - 'a']++;
            }

            String key = Arrays.toString(fr);

            if(mp.containsKey(key)) {
                mp.get(key).add(str);
            } else {
                mp.put(key, new ArrayList<>(List.of(str)));
            }
        }

        for(List<String> values : mp.values()){
            ans.add(values);
        }

        return ans;
    }
}
