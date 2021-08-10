class Solution {
    public int majorityElement(int[] nums) {
        
        int curr_num = 0, count=0;
        
        for (int num :nums){
            
            if(curr_num==0){
                curr_num = num;
                count++;
            }
            else if(curr_num == num){
                count++;
                if (count > nums.length/2) return curr_num;
            }
            else count--;
        }
        
        return curr_num;
        
    }
}
