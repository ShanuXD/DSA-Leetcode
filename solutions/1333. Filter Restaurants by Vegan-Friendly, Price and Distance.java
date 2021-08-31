class Solution {
    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[1] == a[1]? b[0] - a[0]: b[1]-a[1]);
        List<Integer> result = new ArrayList<Integer>();
        
        for(int i=0;i<restaurants.length;i++){
            
             if(veganFriendly <= restaurants[i][2] 
                && maxPrice >= restaurants[i][3] 
                && maxDistance >= restaurants[i][4]) {
                pq.offer(restaurants[i]);
            }
        }
        while(!pq.isEmpty()){
            result.add(pq.poll()[0]);
        }
        return result;
        
    }
}
