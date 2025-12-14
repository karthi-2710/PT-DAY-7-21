public class isPalindrome_LL {
     Node reverseList(Node head) {
        // code here
        Node pre=null;
        Node cur=head;
        Node af=cur.next;
        while(cur!=null){
            cur.next=pre;
            pre=cur;
            cur=af;
            if(af!=null){
            af=af.next;}
        }
        return pre;
    }
    public boolean isPalindrome(Node head) {
        // code here
        Node f=head,s=head;
        
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        
        Node rev=reverseList(s);
        
        Node temp=rev;
        f=head;
        while(f!=null && temp!=null){
            if(f.data==temp.data){
                f=f.next;
                temp=temp.next;
            }else{
                return false;
            }
        }
        
        return true;
        
        
    }
}
