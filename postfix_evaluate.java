import java.util.Stack;

public class postfix_evaluate {
    public int evalRPN(String[] arr) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("*") || arr[i].equals("-") ||  arr[i].equals("+") ||  arr[i].equals("/")){
                int a=st.pop();
                int b=st.pop();
                int c;
                if(arr[i].equals("*")){
                    c=b*a;
                }else if(arr[i].equals("-")){
                    c=b-a;
                }else if(arr[i].equals("+")){
                    c=b+a;
                }else{
                    c=b/a;
                }

                st.push(c);
            }else{
                int n=Integer.parseInt(arr[i]);
                st.push(n);
            }

      }
            return st.pop();
    }
}
