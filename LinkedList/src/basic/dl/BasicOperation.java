package basic.dl;

class Operation{
    void traverse(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
     // insert at beginnings
    Node insertHead(Node head, int val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
        } else {
            head.back=newNode;
            newNode.next=head;
            head=newNode;
        }
        return head;
    }
    // insert at tail
    Node insertTail(Node head, int val){
        Node newNode=new Node(val);
        if(head==null){
            return newNode;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.back=temp;
        return head;
    }
    // insert at pos
    Node insertPos(Node head, int val, int pos){
        Node newNode=new Node(val);
        if(pos<1){
            return head;
        }
        int idx=1;
        Node temp=head;
        while(temp!=null && idx<pos-1) {
            temp = temp.next;
            idx++;
        }
        if(temp!=null){
            temp.next.back=newNode;
            newNode.back=temp;
            newNode.next=temp.next;
            temp.next=newNode;
        }else{
            System.out.println("Invalid Position");
        }
        return head;
    }
    // delete at pos
    Node deletePos(Node head, int pos){
        if(pos<1){
            return head;
        }
        Node temp=head;
        int idx=1;
        while(temp!=null && idx<pos){
            temp=temp.next;
            idx++;
        }
        if(temp!=null){
            temp.back.next=temp.next;
            temp.next.back=temp.back;
        }else{
            System.out.println("invalid Position");
        }
        return head;
    }
    // delete Node
    Node deleteNode(Node head, int val){
        if(head==null){
            return head;
        }
        Node temp=head;
        while(temp!=null){
            if(temp.data==val) break;
            temp=temp.next;
        }
        if(temp!=null) {
            temp.back.next = temp.next;
            temp.next.back = temp.back;
        }else{
            System.out.println("invalid Position");
        }
        return head;
    }

}
public class BasicOperation {
    static Node arrayToList(int[] nums){
        if (nums == null || nums.length == 0) return null;
        Node head=new Node(nums[0]);
        Node prev=head;
        for(int i=1;i<nums.length;i++){
            Node temp=new Node(nums[i]);
            prev.next=temp;
            temp.back=prev;
            prev=temp;
        }
        return head;
    }
    static void traverse(Node head){
        Node temp=head;
        while (temp != null) {
            System.out.println(
                    "Back: " + (temp.back != null ? temp.back.data : "null") +
                            " | Curr: " + temp.data +
                            " | Next: " + (temp.next != null ? temp.next.data : "null")
            );
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        int[] nums={2,5,1,0,9};

//        Node head=null;

        Node head=arrayToList(nums);
//        traverse(head);

        Operation obj=new Operation();
        obj.traverse(head);
        // Insert
        head=obj.insertHead(head,10);
        head=obj.insertTail(head, 20);
        head=obj.insertPos(head,50,4);
        obj.traverse(head);

        //Delete
        head=obj.deletePos(head,6);
        head=obj.deleteNode(head,1);
        obj.traverse(head);

    }
}
