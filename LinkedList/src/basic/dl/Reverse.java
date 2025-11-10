package basic.dl;


import java.util.Stack;

public class Reverse {

    Node reverse(Node head){
        Stack<Integer>  st=new Stack<>();

        Node temp=head;

        while(temp!=null){
            st.push(temp.data);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            temp.data=st.peek();
            st.pop();
            temp=temp.next;
        }
        return head;
    }

    Node reverseLink(Node head){
        if(head==null || head.next==null)
            return head;

        Node temp;
        Node curr=head;

        while(curr!=null){
            // swap karna hai link ko (back <-> next)
            temp=curr.back;
            curr.back=curr.next;
            curr.next=temp;

            if(curr.back==null) head=curr;

            curr=curr.back;  // aage karna hai back se koi swap hua hai
        }
        return head;
    }

     Node makeList(int[] nums){
        Node head=new Node(nums[0]);
        Node mover=head;
        for(int i=1;i<nums.length;i++){
            Node temp=new Node(nums[i]);
            mover.next=temp;
            temp.back=mover;
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

         Reverse obj=new Reverse();
         int[] nums={1,2,3,4,5};
         Node head=obj.makeList(nums);
         obj.traverse(head);

//         head=obj.reverse(head);
        head=obj.reverseLink(head);
         obj.traverse(head);

    }
}
