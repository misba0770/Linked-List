public static Node reverseDLL(Node  head)
{
   Node prev=null;
   Node curr=head;
   while(curr!=null){
       Node temp=curr.next;
       curr.next=prev;
       curr.prev=temp;
       prev=curr;
       curr=temp;
   }
   return prev;
}
