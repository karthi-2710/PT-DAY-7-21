public class reverse_SLL_rec {
    Node revNode(Node head){
        if(head.next==null){
            return head;
        }
        Node temp=revNode(head.next);
        head.next.next=head;
        head.next=null;
        return temp;
    }
}
