package com.aniket;

public class TraverseList {

    Node arrayToList(int nums[]){
        Node head= new Node(nums[0],null);
        Node mover=head;
        for(int i=1;i< nums.length;i++){
            Node temp= new Node(nums[i],null);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }

    int traverse(Node head){
        Node temp=head;
        int count=0;
        while(temp!=null){
            System.out.print(temp.data+" ");
            count++;
            temp=temp.next;
        }
        System.out.println();
        return count;
    }

    public static void main(String[] args) {
        int nums[]={4,5,2,1,0};

        TraverseList obj =new TraverseList();

        Node head=obj.arrayToList(nums);

        System.out.println(head.data);

        System.out.println("Length: "+obj.traverse(head));

    }
}

