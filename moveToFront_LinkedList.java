public class moveToFront_LinkedList {
    public static Node moveToFront(Node head) {
        // code here
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        
        temp.next.next=head;
        head=temp.next;
        temp.next=null;
        
        
        return head;
    }
}
