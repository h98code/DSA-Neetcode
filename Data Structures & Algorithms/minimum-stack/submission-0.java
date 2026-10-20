class MinStack {

    Stack<Long> stk;
    long min;

    public MinStack() {
        stk = new Stack();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        if(val < min) {
            stk.push(2 * (long)val - min);
            min = val;
        } else {
            stk.push((long)val);
        }
    }
    
    public void pop() {
        if(min > stk.peek()) {
            min = (2 * min) - stk.peek();
        } 

        stk.pop();
    }
    
    public int top() {
        long el = stk.peek();
        return (min > el) ? (int) min : (int) el;
    }
    
    public int getMin() {
        return (int)min;
    }
}
