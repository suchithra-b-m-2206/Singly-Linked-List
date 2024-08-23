
import java.util.List;
class CreationSinglyLinkedList {
    private ListNode head;
    private static  class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
    }
    }
    public static void main(String[] args) {
        CreationSinglyLinkedList sll=new CreationSinglyLinkedList();
        sll.head=new ListNode(10);
        ListNode second=new ListNode(20);
        ListNode third=new ListNode(30);
        ListNode fourth=new ListNode(40);
        ListNode five=new ListNode(50);
        ListNode six=new ListNode(60);
      sll.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=five;
        five.next=six;
        ListNode current=sll.head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.print("null");
        
        
    }
}
