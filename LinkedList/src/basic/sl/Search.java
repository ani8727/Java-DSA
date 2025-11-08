package basic.sl;

public class Search {
    static int search(Node head, int val){
        Node temp=head;
        int idx=0;
        while(temp!=null){
            idx++;
            if(temp.data==val) return idx;
            temp=temp.next;
        }
        return -1;
    }
    public static void main(String[] args) {
        Node head=new Node(5);
        head.next=new Node(6);
        head.next.next=new Node(10);
        head.next.next.next=new Node(30);
        head.next.next.next.next=new Node(50);

        System.out.println(search(head,50));
        
        
    }
}
