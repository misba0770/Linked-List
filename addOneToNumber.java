class Solution
{
     static Node reverse(Node head){
        if(head==null || head.next==null) return head;
        Node next=null,cur=head,prev=null;
        while(cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }
    public static Node addOne(Node head) 
    { 
       head=reverse(head);
        
        //For a single case 9
        if(head.data==9 && head.next==null){
            head.data=0;
            Node x=new Node(1);
            head.next=x;
            return reverse(head);
        }
        Node temp=head.next; //Second last node
        int carry=0;
        
        //Checking for the last node
        if(head.data<=8){
            head.data+=1;
            return reverse(head);
        }else{
            head.data=0;
            carry=1;
        }
        
        //Iterating over the rest nodes 
        Node prev=null;
        while(temp!=null){
            if(temp.data<=8){
                temp.data+=carry;
                carry=0;
                return reverse(head);
            }else{
                temp.data=0;
                carry=1;
            }
            prev=temp;
            temp=temp.next;
        }
        Node x=new Node(1);
        prev.next=x;
        return reverse(head);
    }
}
