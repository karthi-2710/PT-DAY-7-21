import java.util.Stack;

public class getMin_from_stack_withoutSpace {
     Stack<Integer> st = new Stack<>();
    int min;
    public getMin_from_stack_withoutSpace() {
        min = -1;
    }
    public void push(int x) {
        if(st.isEmpty()){
            min = x;
            st.push(x);
        }else if(x<=min){
            int decode = 2*x-min; // decoded value (contains info about prev min)
            min = x;
            st.push(decode);
        }else{
            st.push(x);
        }
    }
    public void pop() {
        if(!st.isEmpty()){
            int x = st.pop();
            if(x<min){ // this is decoded value
               int decode = x; // encode to find prev min
               min = 2*min - decode; // decode = 2*currMin - prevMin,  prevMin = 2*currMin - decode
            }
        }
        if(st.isEmpty())
            min = -1;
        
        
    }
    public int peek() {
        if(!st.isEmpty()){
           int x = st.peek();
           if(x<min){ // this is decoded value (actual value is stored in min variable)
                return min;
           }else{
               return x;
           }
        }else{
            return -1;
        }
       
    }

    boolean isEmpty() {
       return st.isEmpty();
    }

    public int getMin() {
        return min;
    }
}
