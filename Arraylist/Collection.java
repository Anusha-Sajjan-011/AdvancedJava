import java.util.ArrayList;
import java.util.Collections;

public class Collection {
    public static void swaaap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(9);

        System.out.println(list);
        Collections.sort(list); // ascending
        System.out.println(list);

        // descending
        Collections.sort(list, Collections.reverseOrder());
        // comparator function logic
        System.out.println(list);

    }

}
