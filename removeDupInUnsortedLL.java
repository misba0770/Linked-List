class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
        HashSet<Integer> hs=new HashSet<>();
        Node temp=new Node(0);
        Node curr=head;
        Node x=temp;
        while(curr!=null){
            if(!hs.contains(curr.data)){
                hs.add(curr.data);
               x.next=curr;
               x=x.next;
               curr=curr.next;
            }
            else{
                curr=curr.next;
            }
        }
        x.next=null;
        return temp.next;
    }
}
