class CustomStack {
    private int[] stack;
    private int[] inc;
    private int top;
    private int maxSize;

    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new int[maxSize];
        this.inc = new int[maxSize];
        this.top = -1;
    }
    
    public void push(int x) {
        if (top < maxSize - 1) {
            top++;
            stack[top] = x;
            inc[top] = 0;
        }
    }
    
    public int pop() {
        if (top < 0) {
            return -1;
        }
        
        int result = stack[top] + inc[top];
        
        // Propagate lazy increment to the element below
        if (top > 0) {
            inc[top - 1] += inc[top];
        }
        
        // Reset the current top's increment before decrementing
        inc[top] = 0;
        top--;
        
        return result;
    }
    
    public void increment(int k, int val) {
        if (top >= 0) {
            // Target the highest valid index among the bottom k elements
            int idx = Math.min(k - 1, top);
            inc[idx] += val;
        }
    }
}