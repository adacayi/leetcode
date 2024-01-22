package uk.co.sancode.leetcode;

public class _27_RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        var begin = 0;
        var end = nums.length - 1;

        while (begin < end) {
            while (begin < end && nums[begin++] != val) ;
            if (begin < end || nums[begin - 1] == val) {
                begin--;
                while (end > begin && nums[end--] == val) ;
                if (end > begin || nums[end + 1] != val) {
                    end++;
                    nums[begin] = nums[end];
                    nums[end] = val;
                    end--;
                    begin++;
                }
            }
        }

        return nums[begin] == val ? begin : begin + 1;
    }
}
