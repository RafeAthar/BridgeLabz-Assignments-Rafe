package ds.assignment;


import java.util.LinkedList;
import java.util.Queue;

public class QueueOperations {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(56);
        q.add(30);
        q.add(70);

        System.out.println("queue elements");
        for(Integer elem: q){
            System.out.println(elem);
        }

        System.out.println("peek element: " + q.peek());

        while(!q.isEmpty()) {
            System.out.println("element removed: " + q.remove());
        }

    }
}
