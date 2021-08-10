class Solution {
    public boolean isPalindrome(String s) {
        ArrayList<Character> charList = new ArrayList<>();
        String str = s.toLowerCase();
        for(char ch : str.toCharArray()){
            if((ch >='a' && ch<='z') || (ch >='0' && ch<='9') ) charList.add(ch);
        }
        Character []ch = charList.toArray(new Character[charList.size()]);
        int i=0, j=charList.size()-1;
        while(i<j){
            if(ch[i]!=ch[j]) return false;
            i++;
            j--;
        }
        return true;
        
    }
}
