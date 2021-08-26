class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        
        int [] cors = new int[n];
        Stack<Integer> stack = new Stack<>();
         int lostTime = -1;
        for (String log: logs){
            
            String []str = log.split(":");
            int functionId = Integer.parseInt(str[0]);
            boolean isStart = "start".equals(str[1]);
            int time = Integer.parseInt(str[2]);
            
            if(!isStart)++time;
           
            if(!stack.isEmpty()){
                int currFunction = stack.peek();
                cors[currFunction] += time-lostTime;
            }
            if(isStart) stack.push(functionId);
            else stack.pop();
            lostTime = time;
        }
        
        return cors;
        
    }
}
