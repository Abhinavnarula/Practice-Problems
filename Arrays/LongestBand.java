import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

// length of longest band possible. a subsequence of elements in an array whose elements are having a difference of 1.

public class LongestBand {

    static int bandLength(int arr[], int n) {

        int temp = -1, maxLength = 0;

        HashSet<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toCollection(HashSet::new));

        for(int i = 0;i<n;i++){
            if(!set.contains(arr[i] - 1)){
                temp = arr[i] + 1;
                int length = 0;
                while(set.contains(temp)){
                    temp++;
                    length++;
                }
                maxLength = Math.max(length, maxLength);
            }
        }

        return maxLength;

    }

    public static void main(String[] args) {

        int arr[] = { 1, 9, 0, 18, 2, 3, 5, 4, 10, 7, 12, 6 };

        int res = bandLength(arr, arr.length);

        System.out.println(res);

    }

}
