import java.util.Stack;

public class findMiddle_inStack{
     public static int ss(Stack<Integer> st,int s){
     if(st.isEmpty()){
        return s;
     }
     int k=st.pop();
     int p=ss(st,s+1);
     st.push(k);
     return p;
    }

public static void main(String[] args) {
    Stack<Integer> st=new Stack<>();
    st.push(2);
    st.push(3);
    st.push(9);
    st.push(5);
    st.push(8);
    int n=ss(st,0);
    System.out.println(n);
   }

}