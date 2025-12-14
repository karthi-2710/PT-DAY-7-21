

class Node
{
    int data;
    Node next;
    Node pre;
    Node(int data)
    {
        this.data = data;
        next = pre = null;
    }
}

public class insertion_in_DLL {
     Node insertAtPos(Node head, int p, int x) {
        // code here
        if(p==0){
            Node newNode=new Node(x);
            newNode.next=head.next;
            head.next=newNode;
            newNode.pre=head;
        }else{
            Node temp=head;
            for(int i=0;i<p;i++){
                temp=temp.next;
            }
            
            
            Node newNode=new Node(x);
            if(temp.next==null){
                temp.next=newNode;
                newNode.pre=temp;
            }else{
            newNode.next=temp.next;
            newNode.pre=temp;
            temp.next.pre=newNode;
            temp.next=newNode;
                
            }
        }
        return head;
    }
}
