class Solution {
    public int[] sortArray(int[] nums) {

        int n = nums.length - 1;

        // selectionSort(nums);
        bubbleSort(nums);

        return nums;
    }

    public void bubbleSort(int[] a) {
        int n = a.length - 1;

        for(int j=n; j>0; j--) {

            boolean swap = false;

            for(int i=0; i<j; i++) {
                if(a[i + 1] < a[i]) {
                    swap = true;
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }

            if(!swap) return;
        }
    }

    public void selectionSort(int[] nums) {
        int n = nums.length - 1;

        for(int i=n; i>0; i--) {

            int max_index = i;

            for(int j=0; j<=i; j++) {
                if(nums[j] > nums[max_index]) {
                    max_index = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[max_index];
            nums[max_index] = temp;
        }
    }
}