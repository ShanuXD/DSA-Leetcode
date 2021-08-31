class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char []chars = s.toCharArray();
        for (char ch: chars) map.put(ch, map.getOrDefault(ch,0)+1);
        int i=0;
        for(char ch: chars){
            if(map.containsKey(ch) && map.get(ch)==1) return i;
            i++;
        }
        return -1;
        
    }
}
