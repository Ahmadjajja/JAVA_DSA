class MyStack {
    Queue<Integer> q;
    Queue<Integer> Q;

    public MyStack() {
        q = new LinkedList<>();
        Q = new LinkedList<>();
    }
    
    public void push(int x) {

        if(!q.isEmpty()){
            q.add(x);
        } else {
            Q.add(x);
        }

    }
    
    public int pop() {
        
        if(!q.isEmpty()){

            while(!q.isEmpty()){
                int n = q.remove();

                if(q.isEmpty()){
                    return n;
                } else {
                    Q.add(n);
                }

            }

        } else if(!Q.isEmpty()){
            while(!Q.isEmpty()){
                int n = Q.remove();
                if(Q.isEmpty()){
                    return n;
                } else {
                    q.add(n);
                }
            }
        }

        return -1;

    } 
    
    public int top() {

        if(!q.isEmpty()){

            while(!q.isEmpty()){
                int n = q.remove();
                Q.add(n);
                if(q.isEmpty()){
                    return n;
                }

            }

        } else if(!Q.isEmpty()){
            while(!Q.isEmpty()){
                int n = Q.remove();
                q.add(n);
                if(Q.isEmpty()){
                    return n;
                }
            }
        }

        return -1;

    }
    
    public boolean empty() {
        return q.isEmpty() && Q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */