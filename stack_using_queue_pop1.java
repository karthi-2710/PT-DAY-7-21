import java.util.*;

public class stack_using_queue_pop1 {

Queue<Integer> q1 =  new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();


    public void push(int a){
        while(!q1.isEmpty()){
            q2.offer(q1.poll());
        }
        q1.add(a);
        while(!q2.isEmpty()){
            q1.offer(q2.poll());
        }
    }
    public boolean isEmpty(){
        return q1.isEmpty();
    }
    public int size(){
        return q1.size();
    }
    public void pop(){
        q1.poll();
        
        
    }public int peek(){
      return  q1.peek();
    }
public static void main(String[] args){
        stack_using_queue st = new stack_using_queue();
        st.push(4);
        st.push(7);
        st.push(9);
        st.push(3);
        st.push(2);
        System.out.println(st.peek());
    }
}


