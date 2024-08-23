

//Remove duplicate from the sorted list

class RemoveDuplicate{
    private ListNode head;
    public static class ListNode{
     private  int data;
     private  ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    
    }
    static ListNode removeduplicate(ListNode header){
       ListNode current=header;
       while(current!=null && current.next!=null){
           if(current.data==current.next.data){
               current.next=current.next.next;
           }
           else{
               current=current.next;
           }
       }
       return header;
    }
    static void display(ListNode header){
        ListNode current=header;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        RemoveDuplicate sll=new RemoveDuplicate();
        sll.head=new ListNode(10);
        ListNode first=new ListNode(10);
        ListNode second=new ListNode(10);
        ListNode third=new ListNode(20);
        ListNode fourth=new ListNode(20);
        ListNode fifth=new ListNode(30);
        sll.head.next=first;
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        display(sll.head);
        ListNode values=removeduplicate(sll.head);
        System.out.println("after removing the duplicate the list contains:");
        display(values);
        
    }
}
