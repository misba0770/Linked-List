class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
    	Node curr=head;
	while(curr.next!=null){
	    Node temp=curr.next;
	    if(curr.data==temp.data)curr.next=temp.next;
	    else curr=curr.next;
	}
	return head;
 
 
    }
}
