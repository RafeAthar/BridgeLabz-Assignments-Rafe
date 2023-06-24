package ds.assignment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListOperations {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(56);
        list.add(30);
        list.add(70);
        System.out.println("UC1 - added in order 56, 30, 70 : " + list);
        list.clear();
        System.out.println("Linked List cleared");

        list.add(70);
        list.add(0, 30);
        list.add(0, 56);
        System.out.println("UC2 - added in order 70 , 30, 56 : " + list);
        list.clear();
        System.out.println("Linked List cleared");

        list.add(70);
        list.add(0,56);
        list.add(1,30);
        System.out.println("UC4 - added in order 70, 56, 30 : " + list);

        list.pop(); // remove(0);
        System.out.println("UC5 - deleted first element: " + list);

        //list.
        list.removeLast();
        System.out.println("UC6 - deleted last element: " + list);

        list.clear();
        System.out.println("Linked List cleared");

        list.add(56);
        list.add(30);
        list.add(70);
        System.out.println("Linked List now : " + list);

        System.out.println("UC7 - index of 30: "+ list.indexOf(30));

        list.add(list.indexOf(30)+1, 40);
        System.out.println("UC8 - added 40 after 30 in list: "+ list);
        System.out.println("current size of List: "+ list.size());

        list.removeFirstOccurrence(40);
        System.out.println("UC9 - removed 40: " + list);

    }
}
