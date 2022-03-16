class Sol
{
   public static Node findIntersection(Node head1, Node head2)
    {
        Node x=new Node(0);
        Node temp=x;
        while(head1!=null&&head2!=null){
            if(head1.data==head2.data){
                Node val=new Node(head1.data);
                temp.next=val;
                head1=head1.next;
                head2=head2.next;
                temp=temp.next;
            }
            else if(head1.data>head2.data)head2=head2.next;
            else head1=head1.next;
        }
        return x.next;
    }
}
