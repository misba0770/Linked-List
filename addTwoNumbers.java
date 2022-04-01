class Solution{
    //Function to add two numbers represented by linked list.
    static Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
       head=prev;
        return head;
    }
    static Node addTwoLists(Node first, Node second){
        if(first==null&&second==null)return first;
        if(first==null&&second!=null)return second;
        if(second==null&&first!=null)return first;
       Node x=reverse(first);
       Node y=reverse(second);
       Node ans=new Node(0);
       Node temp=ans;
       int carry=0;
       while(x!=null||y!=null||carry==1){
           int f=x!=null?x.data:0;
           int s=y!=null?y.data:0;
           int sum=f+s+carry;
           carry=sum/10;
           temp.next=new Node(sum%10);
           if(x!=null)x=x.next;
           if(y!=null)y=y.next;
           temp=temp.next;
      
       }
       return reverse(ans.next);
    }
}
