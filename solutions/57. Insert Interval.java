class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        int []temp = newInterval;
        
        for( int []slot: intervals){
//             before 
            if(temp[1]<slot[0]){
                res.add(temp);
                temp = slot;
            }
//             Overlap
            else if(slot[1]>=temp[0]){
                temp = new int[]{Math.min(slot[0], temp[0]), Math.max(slot[1], temp[1])};
            }
//             After current interval
            else res.add(slot);
        }
        
        res.add(temp);
        return res.toArray(new int[res.size()][]);
    }
}
