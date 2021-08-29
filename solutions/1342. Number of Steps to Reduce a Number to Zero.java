class Solution {
    public int numberOfSteps(int num) {
        int count=0;
        while(num>0){
             // checking the number is even
            if((num & 1) == 0) num = num >>1;
             // subtracting by 1 
            else num = num^1;       
            count++;
        }
        return count;
    }
}
