package basic.sl;

class Solution{
    // traverse List
    void traverse(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    // add at beginnings
    Node addBegin(Node head, int val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
        } else{
            newNode.next=head;
            head=newNode;
        }
        return head;
    }
    // add endings
    Node addEnd(Node head, int val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
        }else{
             Node temp=head;
             while(temp.next!=null){
                 temp=temp.next;
             }
             temp.next=newNode;
        }
        return head;
    }
    // add At position
    Node addPosition(Node head, int val, int pos){
        Node newNode=new Node(val);
        if(pos==1){
            newNode.next=head;
            head=newNode;
            return head;
        }
        Node temp=head;
        int idx=1;
        while(temp!=null && idx<pos-1){;
            temp=temp.next;
            idx++;
        }
        if(temp!=null){
            newNode.next=temp.next;
            temp.next=newNode;
        }else{
            System.out.println("Invalid Position");
        }
        return head;
    }


};

public class BasicOperation {

    Node makeList(int[] nums){
        Node head=new Node(nums[0]);
        Node mover=head;
        for(int i=1;i<nums.length;i++){
            Node temp=new Node(nums[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] nums={3,2,7,9,0,1};

        BasicOperation obj=new BasicOperation();
        Node head=obj.makeList(nums);
        System.out.println(head.data);

        // Basic Function
        Solution sol = new Solution();
        sol.traverse(head);
        
        // insert val
        head=sol.addBegin(head,5);
        head=sol.addEnd(head,3);
        head=sol.addPosition(head,10,10);
        sol.traverse(head);



    }
}
