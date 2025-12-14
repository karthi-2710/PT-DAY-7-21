public class rev_LL {
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
}
