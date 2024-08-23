// Insert node at given position
import java.util.List;
class InsertNodeAtGivenPos {
    private ListNode head;
    private static  class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
    }
    }
    public static ListNode insertNode(ListNode headvalues,int pos){
        ListNode newNode=new ListNode(80);
        if(pos==1){
            newNode.next=headvalues;
            headvalues=newNode;
            return newNode;
        }
        else{
            int count=1;
            ListNode previous=headvalues;
            while(count<pos-1){
                previous=previous.next;
                count++;
            }
            ListNode current=previous.next;
             previous.next=newNode;
            newNode.next=current;
           
        }
        return headvalues;
        
        
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
        InsertNodeAtGivenPos sll=new InsertNodeAtGivenPos();
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
        int pos=3;
        System.out.println("After the Insertion The list containes:");
        ListNode values=insertNode(sll.head,pos);
        display(values);
        System.out.println("Length of list after Insertion: ");
        int length2=findLength(values);
        System.out.print(length2);
        
        
    }
}
