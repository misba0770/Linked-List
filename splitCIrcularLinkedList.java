 void splitList(circular_LinkedList list)
        {
           if(list.head.next==list.head){
             list.head1 = list.head;
             list.head2 = null;
             return;
         }
         Node slow=list.head,fast=list.head;
         while(fast.next!=list.head && fast.next.next!=list.head){
             slow = slow.next;
             fast = fast.next.next;
         }
         Node temp = slow.next;
         slow.next = list.head;
         list.head1 = list.head;
         list.head2 = temp;
         while(temp.next!=list.head) temp = temp.next;
         temp.next = list.head2;
	 }
