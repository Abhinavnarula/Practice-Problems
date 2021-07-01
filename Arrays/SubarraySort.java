public class SubarraySort {
    
    static int[] sort(int arr[], int n){

        int res[] = new int[2];
        int maxE = Integer.MIN_VALUE;
        int minE = Integer.MAX_VALUE;

        for(int i = 1;i<n-1;i++){
            if(arr[i] > arr[i+1] && arr[i] > arr[i-1]){
                maxE = Math.max(maxE, arr[i]);
                minE = Math.min(minE, arr[i]);
            }
            else if(arr[i] < arr[i+1] && arr[i] < arr[i-1]){
                minE = Math.min(minE, arr[i]);
            }

        }

        int i = 0;
        if(arr[i] > minE){
            res[0] = 0;
            i++;
        }
        
        while(i < n && arr[i] < minE){
            i++;
        }

        res[0] = i;

        i = n-1;

        while (i >= 0 && arr[i] > maxE) {
            i--;
        }

        res[1] = i;

        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,8,6,7,9,10,11};
        int[] res = sort(arr, arr.length);
        for(int r : res){
            System.out.print(r + " ");
        }
    }

}
