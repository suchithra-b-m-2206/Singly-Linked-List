//Insert the node at begining


import java.util.List;
class InsrertNodeAtBegin {
    private ListNode head;
    private static  class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
    }
    }
    public static ListNode insertNode(ListNode headvalue){
        ListNode current= headvalue;
        ListNode temp=new ListNode(19);
        temp.next=current;
        headvalue=temp;
        return headvalue;
        
        
    }
    public static void display(ListNode headvalues){
        ListNode current=headvalues;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");
    }
    public static int findLength(ListNode headvalue){
        ListNode current=headvalue;
        int count=0;
        while(current!=null){
            count++;
            current=current.next;
        }
        return count;
    }
    public static void main(String[] args) {
        InsrertNodeAtBegin sll=new InsrertNodeAtBegin();
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
        display(sll.head);
        System.out.println("Length of list= ");
        int length=findLength(sll.head);
        System.out.println(length);
        System.out.println("After the Insertion The list containes:");
        ListNode values=insertNode(sll.head);
        display(values);
        
        
        System.out.println("Length of list after Insertion: ");
        int length2=findLength(values);
        System.out.print(length);
        
        
    }
}
