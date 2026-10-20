class Solution {

    Map<Character, String> mp = Map.of(
        '2', "abc",
        '3', "def",
        '4', "ghi",
        '5', "jkl",
        '6', "mno",
        '7', "pqrs",
        '8', "tuv",
        '9', "wxyz"
    );

    public List<String> letterCombinations(String digits) {
        //generate all the possible combinations -> recursion / backtracking

        // 2 : a b c
        // 23 : ad ae af bd be bf cd ce cf

        List<String> ans = new ArrayList<>();

        if(digits.isEmpty()) return ans;

        StringBuilder sb = new StringBuilder();
        helper(digits, 0, sb, ans);

        return ans;
    }

    private void helper(String dig, int ind, StringBuilder sb, List<String> ans){
        if(ind == dig.length()){
            ans.add(sb.toString());
            return;
        }

        char ch = dig.charAt(ind);

        for(int i=0; i<mp.get(ch).length(); i++){
            sb.append(mp.get(ch).charAt(i));
            helper(dig, ind + 1, sb, ans);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
