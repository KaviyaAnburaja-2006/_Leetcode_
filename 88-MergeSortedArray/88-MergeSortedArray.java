// Last updated: 7/14/2026, 2:14:05 PM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0;i<n;i++){
            nums1[m+i]=nums2[i];
        }
        java.util.Arrays.sort(nums1);
    }
}