package uk.co.sancode.leetcode;

public class _88_MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merged = new int[m + n];
        for (int i = 0, j = 0, k = 0; i < m + n; i++) {
            if (j < m && (k == n || nums1[j] < nums2[k])) {
                merged[i] = nums1[j++];
            } else {
                merged[i] = nums2[k++];
            }
        }
        for (int i = 0; i < m + n; i++) {
            nums1[i] = merged[i];
        }
    }
}
