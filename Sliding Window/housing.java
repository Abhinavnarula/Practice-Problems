import java.util.ArrayList;

public class housing {

    static ArrayList<ArrayList<Integer>> house(int arr[], int n, int target) {

        System.out.println(arr[0]);
        for (int i = 1; i < n; i++) {
            arr[i] += arr[i - 1];
            System.out.println(arr[i]);
        }

        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();

        int start = 0, end = 0;
        while ((start < end) || (end < n - 1) || (start < n - 1)) {
            // System.out.println(">>" + end + " " + start);
            if (arr[end] - arr[start] == target) {
                ArrayList<Integer> temp = new ArrayList<>();
                // System.out.println(end + " " + start);
                temp.add(start);
                temp.add(end);
                res.add(temp);
                temp.clear();
                start++;
            } 
            else if (arr[end] - arr[start] > target)
                start++;
            else
                end++;
        }

        return null;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 1, 4, 1, 3, 2, 1, 1, 2 };
        int target = 8;
        ArrayList<ArrayList<Integer>> house = house(arr, arr.length, target);

        for (ArrayList<Integer> h : house) {
            System.out.println(h);
        }
    }
}
