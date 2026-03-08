class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        String result = "";
        for(int i = 0; i < n; i++){
            if(nums[i].charAt(i) == '0')
                result += '1';
            else
                result += '0';
        }
        return result;
    }
}