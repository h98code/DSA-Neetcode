class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();

        for(int index=0; index<nums.length; index++){
            if(mp.containsKey(target - nums[index])){
                return new int[]{mp.get(target - nums[index]), index};
            }

            mp.put(nums[index], index);
        }

        return new int[0];
    }
}
