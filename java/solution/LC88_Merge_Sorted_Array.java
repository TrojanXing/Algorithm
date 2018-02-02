class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ind1 = m - 1, ind2 = n - 1, i = m+n-1;
        // for(int i = m + n - 1; i >= 0; i--) {
        //     if(ind2 < 0 || (ind1 >= 0 && nums1[ind1] > nums2[ind2])) {
        //         nums1[i] = nums1[ind1--];
        //     } else {
        //         nums1[i] = nums2[ind2--];
        //     }
        // }
        while(ind1 > -1 && ind2 > -1) {
            nums1[i--] = nums1[ind1] > nums2[ind2] ? nums1[ind1--]: nums2[ind2--];
        }
        while(ind2 > -1) {
            nums1[i--] = nums2[ind2--];
        }
    }
}