package com.aniket;
import java.util.LinkedList;

public class BuiltList {
    public static void main(String[] args) {
        LinkedList<Integer>list=new LinkedList<>();

        //Add Element
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // addHead addTail
        list.addFirst(50);
        list.addLast(0);

        // print
        System.out.println("LinkedList: "+ list);

        // Access element
        System.out.println("Index 2: "+list.get(2));
        System.out.println("First: "+list.getFirst());
        System.out.println("First: "+list.getLast());

        // Remove elements
        list.removeFirst();
        list.removeLast();
        list.remove(1);

        System.out.println("After removals: " + list);

        // Iterate
        for (int val : list) {
            System.out.println(val);
        }

        // Check
        System.out.println("Contains 30? " + list.contains(30));
        System.out.println("Size: " + list.size());
    }
}
