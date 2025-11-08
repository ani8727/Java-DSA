package com.aniket;

import java.util.LinkedList;

class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data=data1;
        this.next=next1;
    }
};

public class SinglyList {
    public static void main(String[] args) {

        int[] arr={2,5,6,8};
        Node head=new Node(arr[0],null);
        System.out.println(head+" = "+head.data+" -> "+head.next);

        Node second=new Node(arr[1],null);
        System.out.println(second+" = "+second.data+" -> "+second.next);

        head.next=second;

        Node temp=head;
        while(temp!=null){
            System.out.println(temp+" = "+temp.data+" -> "+temp.next);

            temp=temp.next;
        }
    }
}
