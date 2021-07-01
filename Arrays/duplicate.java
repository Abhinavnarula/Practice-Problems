import java.util.*;

public class duplicate {

    public static void duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> llist = new ArrayList<>(100000);
        HashSet<Integer> set = new HashSet<>(100000);

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i]) && !llist.contains(arr[i]))
                llist.add(arr[i]);
            else {
                set.add(arr[i]);
            }
        }

        if (llist.isEmpty()) {
            llist.add(-1);
        }

        Collections.sort(llist);

        System.out.println(set);

        System.out.println(llist);

    }

    public static void main(String[] args) {
        int arr[] = {1, 6, 3, 1, 6, 3, 6, 6, 3};
        duplicates(arr, arr.length);
    }
}
