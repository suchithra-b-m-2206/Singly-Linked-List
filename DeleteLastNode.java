

class DeleteLastNode{
    private ListNode head;
    public static class ListNode{
     private  int data;
     private  ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    
    }
    static ListNode deletelast(ListNode header){
        ListNode current=header;
        ListNode previous=null;
        if(header==null){
            return header;
        }
        while(current.next!=null){
            previous=current;
            current=current.next;
        }
        previous.next=null;
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
        DeleteLastNode sll=new DeleteLastNode();
        sll.head=new ListNode(10);
        ListNode first=new ListNode(20);
        ListNode second=new ListNode(30);
        ListNode third=new ListNode(40);
        ListNode fourth=new ListNode(50);
        ListNode fifth=new ListNode(60);
        sll.head.next=first;
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        display(sll.head);
        ListNode values=deletelast(sll.head);
        System.out.println("After Deleting the first Node in the given List");
        display(values);
    }
}
