class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        Arrays.sort(a);

        for(int ptr = 0; ptr < a.length - 2; ptr++){
            //get the first appearance of elements as the first number of the triplet
            if(ptr != 0 && (a[ptr] == a[ptr - 1])){
                continue;
            }

            int st = ptr + 1, end = a.length - 1;
            while(st < end){
                int sum = a[ptr] + a[st] + a[end];

                if(sum == 0){
                    ans.add(Arrays.asList(a[ptr], a[st++], a[end--]));
                    while((st < end ) && a[st] == a[st - 1]) st++;
                    while((st < end) && a[end] == a[end + 1]) end--;

                }else if(sum > 0){
                    end--;
                }else{
                    st++;
                }
            }
        }

        return ans;
    }
}
