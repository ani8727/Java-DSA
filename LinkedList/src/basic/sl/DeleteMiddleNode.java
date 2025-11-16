package basic.sl;

public class DeleteMiddleNode {
    static void deleteMiddle(Node head){
        if(head==null || head.next==null){
            return;
        }
        Node slow=head;
        Node fast=head;
        Node prev=slow;

        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;

        }
        prev.next=slow.next;
    }
    static void insert(Node head, int data){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new Node(data);
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        insert(head,3);
        insert(head,4);
        insert(head,7);
        insert(head,1);
        insert(head,2);
        insert(head,6);

        deleteMiddle(head);

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
