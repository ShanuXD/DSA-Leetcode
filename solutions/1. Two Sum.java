class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
        for (int num: nums){
            int diff = target-num;
            if(map.containsKey(diff)){
                int []res = {map.get(diff), i};
                return res;
            }
            map.put(num, i);
            i++;
        }
        return null;
        
    }
}
