public class isPalindrome_SLLRec {
    public static Node head2;

   



    public static boolean cplain(Node head){
        if(head==null){
            return true;
        }

        boolean ans=cplain(head.next);
        if(head.data!=head2.data){
            return false;
        }
        head2=head2.next;
        return ans;

    }
  public boolean ispalindrome(Node head){
    head2=head;
    return cplain(head);
  }
 



}
