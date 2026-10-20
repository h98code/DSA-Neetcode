class Solution {

    class Pair{
        int val;
        int index;

        Pair(int val, int index){
            this.val = val;
            this.index = index;
        }

        public int getVal(){
            return val;
        }

        public int getIndex(){
            return index;
        }
    }

    public int[] twoSum(int[] nums, int target) {
        //brute force O(n2)
        // construct a sorted list of pairs and then apply sorted 2 sum 
        //use hashmap to store the value, index pair

        List<Pair> arr = new ArrayList<>();
        for(int index = 0; index < nums.length; index++){
            arr.add(new Pair(nums[index], index));
        }

        arr.sort(new Comparator<Pair>(){
            @Override
            public int compare(Pair p1, Pair p2){
                if(p1.getVal() != p2.getVal()){
                    return Integer.compare(p1.getVal(), p2.getVal());
                }

                return Integer.compare(p1.getIndex(), p2.getIndex());
            }
        });

        int ptr1 = 0, ptr2 = arr.size() - 1;

        while(ptr1 < ptr2){
            int val1 = arr.get(ptr1).val;
            int val2 = arr.get(ptr2).val;

            if(val1 + val2 < target){
                ptr1++;
            }else if(val1 + val2 > target){
                ptr2--;
            }else{
                int smallerIndex = Math.min(arr.get(ptr1).index, arr.get(ptr2).index);
                int greaterIndex = Math.max(arr.get(ptr1).index, arr.get(ptr2).index);
                return new int[]{smallerIndex, greaterIndex};
            }
        } 

        return new int[0];
    }
}
