public class P155 {
    Stack<Integer> s = new Stack<Integer>();
    int min = Integer.MAX_VALUE;
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(val<=min){
            s.push(min);
            min = val;
        }
        s.push(val);
    }
    
    public void pop() {
        if(s.pop()==min) min=s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return min;
    }
}
