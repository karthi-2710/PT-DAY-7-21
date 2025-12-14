import java.util.Queue;
import java.util.Stack;

public class rev_first_k_inqueue {
     public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        Stack<Integer> st=new Stack<>();
   
    if(k>q.size()){
        return q;
    }    
     for (int i = 0; i < k; i++) {
            st.push(q.poll());
        }
    
  
    while(!st.isEmpty()){
        q.offer(st.pop());
       }
    
    
    
    int r = q.size() - k;
    
    for (int i = 0; i < r; i++) {
       q.offer(q.poll());
        }
    
    
    return q;
}
}
