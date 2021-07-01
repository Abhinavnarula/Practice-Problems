// length of larget mountain.

public class MountainProblem {
    
    static int mountain(int arr[], int n) {

        int maxLength = -1;

        for(int i = 1;i<n-1;){
            
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){

                int res = 0;
                int index = i;

                while (index > 0) {
                    if (arr[index] > arr[index - 1]) {
                        index--;
                        res++;
                    } else
                        break;
                }

                while (i < n - 1) {
                    if (arr[i] > arr[i + 1]) {
                        i++;
                        res++;
                    } else
                        break;
                }

                res++;

                maxLength = Math.max(maxLength, res);
                
            }
            else {
                i = i + 1;
            }
        }

        return maxLength;

    }

    // static int length(int arr[], int n, int index){

    //     int res = 0;
    //     int i = index;
    //     while(i > 0){
    //         if(arr[i] > arr[i-1]){
    //             i--;
    //             res++;
    //         }
    //         else
    //             break;
    //     }
        
    //     i = index;

    //     while(i < n-1){
    //         if (arr[i] > arr[i + 1]) {
    //             i++;
    //             res++;
    //         } else
    //             break;
    //     }

    //     return res + 1;
    // }

    public static void main(String[] args) {
        int arr[] = {5,6,1,2,3,4,5,4,3,2,0,1,2,3,-2,4};
        int result = mountain(arr, arr.length);
        System.out.println(result);

    }

}
