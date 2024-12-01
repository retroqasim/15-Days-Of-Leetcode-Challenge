class Solution {
    public boolean isAnagram(String s, String t) {
        boolean x = true;
        int i = 0;

        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);


        if(c1.length == c2.length){
       
        while (i < c1.length) {
            if (c1[i] != c2[i]) {
                x = false;
                break;
            }
            i++;
        }
        }

        else
        x = false;
        return x;
    }
}