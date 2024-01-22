package uk.co.sancode.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _88_MergeSortedArrayTest {
    @Test
    void merge_shouldMerge() {
        // Given
        var nums1 = new int[]{4, 5, 5, 8, 0, 0, 0};
        var nums2 = new int[]{1, 6, 9};
        var merge = new _88_MergeSortedArray();

        // When
        merge.merge(nums1, nums1.length - nums2.length, nums2, nums2.length);

        // Then
        assertThat(nums1).containsExactly(1, 4, 5, 5, 6, 8, 9);
    }
}
