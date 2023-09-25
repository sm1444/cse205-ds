public class P682 {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int sum=0;
        for(String s : operations)
        {
            if(s.equals("D"))
            {
                stack.push(stack.peek()*2);
            }
            else if(s.equals("C"))
            {
                stack.pop();
            }
            else if(s.equals("+")){
                if(stack.size()>=2)
                {
                    int n1 = stack.pop();
                    int n2 = stack.pop();
                    int n = n1 + n2;
                    stack.push(n2);
                    stack.push(n1);
                    stack.push(n);
                }
            }
            else{
                stack.push(Integer.parseInt(s));
            }
        }
        while(!stack.isEmpty())
        {
            sum = sum+stack.peek();
            stack.pop();
        }
        return sum;
    }
}
