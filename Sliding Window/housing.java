import java.util.ArrayList;

public class housing {

    static ArrayList<ArrayList<Integer>> house(int arr[], int n, int target) {

        // System.out.println(arr[0]);
        for (int i = 1; i < n; i++) {
            arr[i] += arr[i - 1];
            // System.out.println(arr[i]);
        }

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();

        int start = 0, end = 0;
        while (start <= end && end < n) {
            if (arr[end] - arr[start] == target) {
                temp.add(start + 1);
                temp.add(end);
                res.add(new ArrayList<>(temp));
                temp.clear();
                start++;
            } else if (arr[end] - arr[start] > target) {
                start++;
            } else {
                end++;
            }
        }
        return res;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 1, 4, 1, 3, 2, 1, 1, 2 };
        int target = 8;
        ArrayList<ArrayList<Integer>> home = house(arr, arr.length, target);
        System.out.println(home);

    }
}
