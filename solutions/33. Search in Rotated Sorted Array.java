class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 0) return -1;
        int left=0, right=nums.length-1;
        while(left<=right){
            System.out.println("left:"+left+"  "+"right:"+ right);
            int mid = (left+right)/2;
            int leftNum = nums[left];
            int rightNum = nums[right];
            int possibleMatch = nums[mid];
            
            if(possibleMatch == target) return mid;
            
            if(leftNum<=possibleMatch){
                if(leftNum<=target && target<possibleMatch) right=mid-1;
                else left=mid+1;
                
            }else{
                if(rightNum>=target && target>possibleMatch) left=mid+1;
                else right=mid-1;
            }
            
        }
        return -1;
        
    }
}
