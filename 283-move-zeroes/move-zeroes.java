class Solution {
    public void moveZeroes(int[] nums) {
        int ZeroFoundAt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[ZeroFoundAt];
                nums[ZeroFoundAt] = nums[i];
                nums[i] = temp;
                ZeroFoundAt++;
            }
        }
    }
}
