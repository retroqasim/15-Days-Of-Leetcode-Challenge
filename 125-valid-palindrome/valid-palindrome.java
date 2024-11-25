class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("\\s", "");
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        int left = 0;
        int right = s.length() - 1;
        int flag;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
            return false;
            }
            left++;
            right--;
        }
        return true;
    }
}