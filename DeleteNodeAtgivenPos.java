//delete a node at givn position

class DeleteNodeAtgivenPos{
    private ListNode head;
    public static class ListNode{
     private  int data;
     private  ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    
    }
    static ListNode deletepos(ListNode header,int pos){
        if(pos==1){
            return header;
        }
        else{
            int count=1;
            ListNode current=header;
            ListNode previous=null;
            while(count<pos-1){
                current=current.next;
                count++;
             }
            previous=current.next;
            current.next=previous.next;
            return header;
            
        }
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
        DeleteNodeAtgivenPos sll=new DeleteNodeAtgivenPos();
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
        int pos=3;
        ListNode values=deletepos(sll.head,pos);
        System.out.println("After Deleting the first Node in the given List");
        display(values);
    }
}
