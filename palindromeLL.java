class Solution
{
    Node reverse(Node head){
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
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        Node temp1=head;
        Node temp2=reverse(head);
        while(temp1!=null){
            if(temp1.data!=temp2.data)return false;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return true;
    }    
}

