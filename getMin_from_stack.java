import java.util.Stack;

public class getMin_from_stack {
     Stack<Integer> st;
    Stack<Integer> minst;
    public getMin_from_stack() {
        // Define Stack
    st=new Stack<>();
    minst=new Stack<>();

    }

    public void push(int x) {
        // Add an element to the top of Stack
        if(minst.isEmpty()||x<=minst.peek()){ 
            st.push(x);
            minst.push(x);
        } else{
            st.push(x);
        }
        
    }

    public void pop() {
        // Remove the top element from the Stack
        if(st.peek()==minst.peek()){
            st.pop();
            minst.pop();
        }else{
            st.pop();
        }
    }

    public int peek() {
        // Returns top element of the Stack
        if(!st.isEmpty()){
        return st.peek();
    }
    return -1;
    }

    boolean isEmpty() {
        // Check if the stack is empty
        return st.isEmpty();
    }

    public int getMin() {
        // Finds minimum element of Stack
        if(!minst.isEmpty()){
            return minst.peek();
        }
        
    return -1;
        
    }
}
