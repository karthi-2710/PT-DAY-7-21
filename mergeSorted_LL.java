public class mergeSorted_LL {
    Node sortedMerge(Node head1, Node head2) {
        Node dummy = new Node(0);
        Node res = dummy;
        Node t1=head1,t2=head2;
        while (t1 != null && t2 != null) {
            if (t1.data <= t2.data) {
                res.next = t1;
                t1 = t1.next;
            } else {
                res.next = t2;
                t2 = t2.next;
            }
            res = res.next;
        }
        if (t1 != null) {
            res.next = t1;
        } else {
            res.next = t2;
        }
        return dummy.next;
    }
}
