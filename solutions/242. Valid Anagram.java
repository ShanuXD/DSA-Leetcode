class Solution {
    public boolean isAnagram(String s, String t) {
        
        if (s.length() != t.length())return false;
        
        int xor = 0;
        char []str1 = s.toCharArray();
        char []str2 = t.toCharArray();
        
        for (int i=0; i<str1.length; i++)
            xor ^= str1[i]^str2[i];
        
        return(xor==0);
    }
}
