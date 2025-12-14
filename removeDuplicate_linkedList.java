public class removeDuplicate_linkedList {
    Node removeDuplicates(Node head) {
        // Your code here
        Node temp = head;
        while(temp!=null && temp.next!=null){
            if(temp.data!=temp.next.data){
                temp=temp.next;
            }else{
                temp.next=temp.next.next;
            }
        }
        
        
        return head;
        
    }
}
