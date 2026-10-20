class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs) {
            sb.append(str.length() + ":" + str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<str.length(); i++){            
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                sb.append(str.charAt(i));
            } else if(str.charAt(i) == ':') {
                int len = Integer.parseInt(sb.toString());
                ans.add(str.substring(i + 1, i + 1 + len));
                i += len;
                sb.setLength(0);
            }
        }

        return ans;
    }
}
