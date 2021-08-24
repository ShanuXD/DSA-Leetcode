class MyQueue {
        Stack<Integer> stackA = new Stack<>();
        Stack<Integer> stackB = new Stack<>();
    public MyQueue() {
        // Stack<Integer> stackA = new Stack<>();
        // Stack<Integer> stackB = new Stack<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        stackA.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while(!stackA.empty()){
            stackB.push(stackA.pop());
        }
        int res = stackB.pop();
        while(!stackB.empty()){
            stackA.push(stackB.pop());
        }
        return res;
    }
    
    /** Get the front element. */
    public int peek() {
        while(!stackA.empty()){
            stackB.push(stackA.pop());
        }
        int res = stackB.peek();
        while(!stackB.empty()){
            stackA.push(stackB.pop());
        }
        return res;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stackA.empty();
    }
}
​
/**
 * Your MyQueue object will be instantiated and called as such:
