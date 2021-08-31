class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int size = temperatures.length;
        int []res = new int [size];
        Stack<Integer> stack = new Stack<>();
        
        for (int i=0; i<size; i++){
            int temp = temperatures[i];
            while(!stack.isEmpty() && temperatures[stack.peek()]<temp){
                int index = stack.pop(); 
                res[index] = i-index;
            }
            stack.push(i);
        }
        return res;
        
    }
}
