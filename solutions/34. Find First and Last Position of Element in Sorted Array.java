class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[] = {-1, -1};
        if(nums == null || nums.length == 0)
                return res;
        
        int left = 0, right = nums.length-1;
        // Search Left
        while(left<right){
            int mid=(left+right)/2;
            if(nums[mid]<target) left=mid+1;
            else right=mid;
        }
        if(nums[left]!=target) return res;
        res[0] = left;
        right = nums.length-1;
        // Search Right         
        while(left<right){
            int mid=(left+right)/2+1;
            if(nums[mid]>target) right=mid-1;
            else left=mid;
        }
        res[1] = right;
        return res;
    }
}
