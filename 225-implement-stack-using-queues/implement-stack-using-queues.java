class MyStack {

    Queue<Integer> s1;
    Queue<Integer> s2;

    public MyStack() {
        s1 = new LinkedList<>();
        s2 = new LinkedList<>();
    }
    
    public void push(int x) {
        // 1. Add the new element to s2
        s2.offer(x);
        
        // 2. Transfer all prior elements from s1 behind x
        while (!s1.isEmpty()) {
            s2.offer(s1.poll());
        }
        
        // 3. Swap references so s1 always holds the stack elements
        Queue<Integer> temp = s1;
        s1 = s2;
        s2 = temp;
    }
    
    public int pop() {
        return s1.poll();
    }
    
    public int top() {
        return s1.peek();
    }
    
    public boolean empty() {
        return s1.isEmpty();
    }
}