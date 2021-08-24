class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int size = nums.length;
        int res [] =new int[size];
        for (int i=0; i<size; i++){
            int j=i+1;
            while(nums[i]>=nums[j%size] && i!=(j%size)) j++;
            res[i] = i!=(j%size)?nums[j%size]:-1;        
        }
        return res;
    }
}
