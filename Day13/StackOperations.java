package ds.assignment;

import java.util.LinkedList;
import java.util.Stack;

public class StackOperations {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();

        s.push(70);
        s.push(30);
        s.push(56);

        System.out.println("stack elements");
        for(Integer elem: s){
            System.out.println(elem);
        }

        System.out.println("peek element: " + s.peek());

        while(!s.isEmpty()) {
            System.out.println("element popped: " + s.pop());
        }

    }

}
