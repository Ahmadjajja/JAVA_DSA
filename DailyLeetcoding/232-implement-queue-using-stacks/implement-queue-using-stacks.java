class MyQueue {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public MyQueue() {
        first = new Stack<>();
        second = new Stack<>();
    }
    
    public void push(int x) {
        first.push(x);
    }
    
    public int pop() {
        while(!first.empty()){
            second.push(first.pop());
        }

        int popped = second.pop();

        while(!second.empty()){
            first.push(second.pop());
        }

        return popped;
    }
    
    public int peek() {
        while(!first.empty()){
            second.push(first.pop());
        }

        int peeked = second.peek();

        while(!second.empty()){
            first.push(second.pop());
        }
        
        return peeked;
    }
    
    public boolean empty() {
        return first.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */