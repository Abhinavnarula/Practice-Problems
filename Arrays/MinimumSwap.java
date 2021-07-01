import java.util.TreeMap;

public class MinimumSwap {


    static int swap(int arr[], int n){

        TreeMap<Integer,Integer> map = new TreeMap<>();
        
        for(int i = 0;i<n;i++){
            map.put(arr[i], i);
        }

        boolean visited[] = new boolean[n];

        for(int i = 0;i<n;i++){
            
        }

        return -1;
    }
    
    public static void main(String[] args) {
        int arr[] = {2,4,5,1,3};
        int swap = swap(arr,arr.length);
        System.out.println(swap);
    }

}
