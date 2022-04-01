class Solution
{
    //Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head)
    {
        // add your code here
         if(head==null || head.next==null) return head;
        Node temp=null;
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        temp.next=null;
       Node l1= mergeSort(head);
        Node l2=mergeSort(slow);
        return mergeList(l1,l2);
    }
    static Node mergeList(Node l1,Node l2){
        Node ans=new Node(0);
        Node temp=ans;
        while(l1!=null&&l2!=null){
            if(l1.data<=l2.data){
                temp.next=new Node(l1.data);
                l1=l1.next;
                
            }
            else{
                temp.next=new Node(l2.data);
                l2=l2.next;
            }
            temp=temp.next;
        }
        if(l1==null)temp.next=l2;
        else if(l2==null)temp.next=l1;
        return ans.next;
    }
}


