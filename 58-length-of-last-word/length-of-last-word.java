class Solution {
    public int lengthOfLastWord(String s) {
         String[] s1 = s.split(" ");

        int len = s1[s1.length - 1].length();
        return len;

        
    }
}