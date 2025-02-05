package linkedlist;

import java.util.LinkedList;

public class Collections {
    public static void main(String[] args) {
        // Create-no primitive dataobj int, float, boolean-> use Integer, Float,
        // Character class
        LinkedList<Integer> ll = new LinkedList<>();

        // add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        // 0->1->2
        System.out.println(ll);

        // remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
