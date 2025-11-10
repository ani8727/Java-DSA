package basic.sl;

public class AddTwoNum {

    Node addSum(Node head1, Node head2){
        Node dummy=new Node(0);
        Node curr= dummy;

        int carry=0;

        while(head1!=null || head2!=null || carry!=0){
            int sum=carry;
            if(head1!=null){
                sum+=head1.data;
                head1=head1.next;
            }
            if(head2!=null){
                sum+=head2.data;
                head2=head2.next;
            }
            carry=sum/10;

            curr.next= new Node(sum%10);

            curr=curr.next;
        }
        return dummy.next;
    }

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
    void traverse(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        AddTwoNum obj=new AddTwoNum();

        int[] nums1={2,4,5};
        Node head1=obj.makeList(nums1);
        obj.traverse(head1);
        int[] nums2={5,6,4};
        Node head2=obj.makeList(nums2);
        obj.traverse(head2);

        Node head3=obj.addSum(head1,head2);
        obj.traverse(head3);
    }
}
