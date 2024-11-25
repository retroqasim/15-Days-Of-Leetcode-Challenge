class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        int len = nums.length;

        for (int i = 0; i < len - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[j++] = nums[i];
            }
        }

        nums[j++] = nums[len - 1];
        return j;
    }
}