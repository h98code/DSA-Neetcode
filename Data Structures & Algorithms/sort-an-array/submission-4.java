class Solution {
    public int[] sortArray(int[] nums) {

        int n = nums.length - 1;

        // selectionSort(nums);
        // bubbleSort(nums);
        // insertionSort(nums);
        // mergeSort(nums);
        quickSort(nums, 0, nums.length - 1);

        return nums;
    }

    public void quickSort(int[] a, int st, int end) {

        if(st >= end) return;

        // using the st index as a pivot and partition the array around the pivot

        int ptr = st + 1;
        for(int i=st + 1; i<=end; i++) {
            if(a[i] <= a[st]) {
                int temp = a[ptr];
                a[ptr++] = a[i];
                a[i] = temp;
            }
        }
        
        // ptr is pointing at an element that is greater than the pvt;
        ptr--;

        int temp = a[ptr];
        a[ptr] = a[st];
        a[st] = temp;

        quickSort(a, st, ptr - 1);
        quickSort(a, ptr + 1, end);
    }

    public void mergeSort(int[] a) {

        int n = a.length;

        if(n <= 1) return;

        int[] u = new int[n / 2];
        int[] v = new int[n - n/2];

        // u and v are populated
        for(int i=0; i<n; i++){
            if(i < n/2) {
                u[i] = a[i];
            } else {
                v[i - n/2] = a[i];
            }
        }

        mergeSort(u);
        mergeSort(v);
        merge(a, u, v);
    }

    public void merge(int[] a, int[] u, int[] v) {
        
        int up = 0, vp = 0;

        for(int ptr = 0; ptr < a.length; ptr++) {
            if(up < u.length && vp < v.length) {
                a[ptr] = u[up] <= v[vp] ? u[up++] : v[vp++];
            } else if(up < u.length) {
                a[ptr] = u[up++];
            } else {
                a[ptr] = v[vp++];
            }
        }
    }

    public void insertionSort(int[] a) {

        int n = a.length - 1;

        for(int i=1; i<=n; i++) {
            for(int j=i-1; j>=0; j--) {
                if(a[j + 1] < a[j]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
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