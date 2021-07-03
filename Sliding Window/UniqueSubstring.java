import java.util.HashMap;

public class UniqueSubstring {

    static int subString(char[] arr, int n){

        int start=0,end=0;
        int maxLength = 0;
        HashMap<Character,Integer> map = new HashMap<>();

        while(start <= end && end < n){
            if(!map.containsKey(arr[end])){
                map.put(arr[end], end);
                maxLength = Math.max(maxLength, end - start + 1);
                System.out.println(maxLength + " >> " + start + " " + end);
                end++;
            }
            else{
                start = map.get(arr[end]);
                map.put(arr[end], start);
                // start++;
                // end++;
                System.out.println(">> " + start + " " + end);
            }
            // System.out.println(start + " " + end);
        }

        return maxLength;
    }
    public static void main(String[] args) {
        String s = "prateekbhaiya";
        int res = subString(s.toCharArray(), s.length());
        System.out.println(res);
    }
}
