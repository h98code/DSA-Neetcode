class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        // 3 for loops and find the elements and insert them in a set for uniqueness.

        // sort the array. 
        // can we somehow use 2 ptr approach and also remove duplicates in the same approach

        Arrays.sort(a);
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0; i<a.length - 2; i++) {

            if(i != 0 && a[i] == a[i - 1]) continue; // removing the duplicate iterations

            int l = i + 1, r = a.length - 1;

            while(l < r) {
                int sum = a[i] + a[l] + a[r];

                if(sum == 0) {
                    ans.add(new ArrayList<>(Arrays.asList(a[i], a[l], a[r])));
                    l++;
                    r--;
                    while(l < r && a[l] == a[l - 1]) l++;
                    while(l < r && a[r] == a[r + 1]) r--;
                } else if (sum > 0) {
                    r--;
                } else {
                    l++;
                }
            }
        }

        return ans;
    }
}
