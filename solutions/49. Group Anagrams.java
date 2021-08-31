class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // use map to store the sorted word
        // if sorted word not present add it to the map
​
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        for(String str : strs){
            String sortedWord = getSortedWord(str);
            if(map.containsKey(sortedWord)) {
                ArrayList<String> list = map.get(sortedWord);
                list.add(str);
                map.put(sortedWord, list);
            }
            else{
                ArrayList<String> list = new ArrayList<>();
                list.add(str);
                map.put(sortedWord, list);
            }
        }
​
        for (String word: map.keySet()) res.add(map.get(word));
​
        return res;
​
    }
​
    public static String getSortedWord(String str){
        char []chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
