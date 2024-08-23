//Deleting the first node in the given List

class DeletefirstNode{
    private ListNode head;
    public static class ListNode{
     private  int data;
     private  ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    
    }
    static ListNode deletefirst(ListNode header){
        ListNode current=header;
        if(header==null){
            return header;
        }
        current=header.next;
        return current;
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
        DeletefirstNode sll=new DeletefirstNode();
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
        ListNode values=deletefirst(sll.head);
        System.out.println("After Deleting the first Node in the given List");
        display(values);
    }
}
