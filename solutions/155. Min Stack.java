class MinStack {
​
    Stack<Integer> stackA = new Stack<>();
    Stack<Integer> stackB = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        stackA.push(val);
        if(val<=getMin()) stackB.push(val);
    }
    
    public void pop() {
        int val = stackA.pop();
        if(val == getMin())stackB.pop();
    }
    
    public int top() {
        return stackA.peek();
    }
    
    public int getMin() {
        if(stackB.isEmpty()) return Integer.MAX_VALUE;
        else return stackB.peek();
    }
}
​
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
