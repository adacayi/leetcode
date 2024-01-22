package uk.co.sancode.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class _27_RemoveElementTest {
    @Test
    void givenNullArray_removeElement_shouldReturnCorrectLength() {
        // Given
        int[] nums = null;
        var val = 1;
        var remove = new _27_RemoveElement();

        // When
        var result = remove.removeElement(nums, val);

        // Then
        assertThat(result).isZero();
        assertThat(nums).isNull();
    }

    void givenEmptyArray_removeElement_shouldReturnCorrectLength() {
        // Given
        var nums = new int[0];
        var val = 1;
        var remove = new _27_RemoveElement();

        // When
        var result = remove.removeElement(nums, val);

        // Then
        assertThat(result).isZero();
        assertThat(nums).isEmpty();
    }

    @Test
    void givenAllElementsVal_removeElement_shouldRemoveAndReturnZero() {
        // Given
        var nums = new int[]{3, 3};
        var val = 3;
        var remove = new _27_RemoveElement();

        // When
        var result = remove.removeElement(nums, val);

        // Then
        assertThat(result).isZero();
    }

    @Test
    void removeElement_shouldRemoveAndReturnCorrectLength() {
        // Given
        var nums = new int[]{1, 3, 5, 3, 2, 1, 8, 1};
        var val = 1;
        var remove = new _27_RemoveElement();

        // When
        var result = remove.removeElement(nums, val);

        // Then
        assertThat(result).isEqualTo(5);
        assertThat(Arrays.copyOfRange(nums, 0, 5)).containsExactlyInAnyOrder(2, 3, 3, 5, 8);
    }

    @Test
    void givenCase1_removeElement_shouldRemoveAndReturnCorrectLength() {
        // Given
        var nums = new int[]{3, 2, 2, 3};
        var val = 3;
        var remove = new _27_RemoveElement();

        // When
        var result = remove.removeElement(nums, val);

        // Then
        assertThat(result).isEqualTo(2);
        assertThat(Arrays.copyOfRange(nums, 0, 2)).containsExactlyInAnyOrder(2, 2);
    }
}
