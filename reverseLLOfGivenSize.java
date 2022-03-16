class Solution
{
    public static Node reverse(Node head, int k)
    {
       if(head==null||k==1)return head;
       Node dummy=new Node(0);
       dummy.next=head;
       Node curr=dummy,prev=dummy,temp=dummy;
       int count=0;
       while(curr.next!=null){count++;curr=curr.next;}
       while(count>=k){
           curr=prev.next;
           temp=curr.next;
           for(int i=1;i<k;i++){
               curr.next=temp.next;
               temp.next=prev.next;
               prev.next=temp;
               temp=curr.next;
           }
           prev=curr;count-=k;
       }
       if(count!=0){
            curr=prev.next;
           temp=curr.next;
           for(int i=1;i<count;i++){
               curr.next=temp.next;
               temp.next=prev.next;
               prev.next=temp;
               temp=curr.next;
           }
           prev=curr;
       }
       
       return dummy.next;
    }
}

