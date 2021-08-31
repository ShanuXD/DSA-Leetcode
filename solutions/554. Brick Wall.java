class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxCut = 0;
        for(List<Integer> row : wall){
            int xCord=0;
            for (int i=0; i<row.size()-1; i++){
                xCord += row.get(i);
                map.put(xCord, map.getOrDefault(xCord, 0)+1);
                maxCut = Math.max(maxCut, map.get(xCord));
            }
        }
        return wall.size()-maxCut;
    }
}
