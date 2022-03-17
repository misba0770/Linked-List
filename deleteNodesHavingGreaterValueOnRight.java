class Solution
{
    Node compute(Node head)
    {
       head = reverse(head);
        
        int max = Integer.MIN_VALUE;
        Node curr = head , prev = null , next = null;
        
        while(curr != null){
            next = curr.next;
            if(curr.data < max){
                prev.next = next;
                curr.next = null;
                curr = next;
            }
            else{
               max = Math.max(max , curr.data);
               prev = curr;
               curr = next;
            }
        }
        
        return reverse(head);
    }
         Node reverse(Node head){
        
        Node curr = head , prev = null , next = null;
        
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
    
        return prev;
    }
}

  
