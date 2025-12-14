import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class nextGreater_element {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer> ar=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        
        ar.add(-1);
        st.push(arr[arr.length-1]);
       for(int i=arr.length-2;i>=0;i--){
           if(arr[i]<st.peek()){
               ar.add(st.peek());
               st.push(arr[i]);
           }else{
               while(!st.isEmpty()){
                   if(arr[i]<st.peek()){
                       ar.add(st.peek());
                       st.push(arr[i]);
                       break;
                   }
                   st.pop();
               }
               
               if(st.isEmpty()){
                   ar.add(-1);
                   st.push(arr[i]);
               }
               
               
           }
       }
       
       
       
      Collections.reverse(ar);
       
       
        return ar;
    }
}
