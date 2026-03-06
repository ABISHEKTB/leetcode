class Solution {
    public boolean checkOnesSegment(String s) {
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == '0' && s.charAt(i) == '1') {
                count++;
            }
        }
        return count == 0;
    }
}