class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] array = new int[m+n];

        int i = 0;
        int j = 0;
        int a = 0;

        while(i < m && j < n){
            if(nums1[i] >= nums2[j]){
                array[a++] = nums2[j];
                j++;
            }
            else{
                array[a++] = nums1[i];
                i++;
            }


        }


        while(i < m){
            array[a++] = nums1[i];
            i++;
        }

        while(j < n){
            array[a++] = nums2[j];
            j++;
        }

        for (int k = 0; k < array.length; k++) {
            nums1[k] = array[k];
        }

    }
}