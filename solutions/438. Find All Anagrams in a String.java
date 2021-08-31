class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> res = new ArrayList<>();
        int len1 = s.length();
        int len2 = p.length();
        char []chars = p.toCharArray();
        Arrays.sort(chars);
        for (int i=0; i<=len1-len2; i++){
            String str = s.substring(i,i+len2);
            if(helper(str, chars)) res.add(i);
        }
        
        return res;
        
    }
    
    public static Boolean helper(String str, char chars[]){
        char []arr = str.toCharArray();
        Arrays.sort(arr);
        for(int i=0 ; i<arr.length; i++){
            if(arr[i]!=chars[i]) return false;
        }
        return true;
    }
}
