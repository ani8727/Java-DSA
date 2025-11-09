package com.aniket;

class Dnode{
    int data;
    Dnode next;
    Dnode back;

    Dnode(int val){
        data=val;
        next=null;
        back=null;
    }
}

public class DoublyList {
    static Dnode arrayToList(int[] nums){
        if (nums == null || nums.length == 0) return null;
        Dnode head=new Dnode(nums[0]);
        Dnode prev=head;
        for(int i=1;i<nums.length;i++){
            Dnode temp=new Dnode(nums[i]);
            prev.next=temp;
            temp.back=prev;
            prev=temp;
        }
        return head;
    }

    static void traverse(Dnode head){
        Dnode temp=head;
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

        Dnode head=arrayToList(nums);
        traverse(head);

    }
}
