//Finding smallest character in an array (of dtype char) that is larger than target(of dtype char)
public class Solution {
    public static void main(String[] args) {
        char[] arr = {'c', 'f', 'j', 't'};
        char target = 'z';
        int ans = nextGreatestchar(arr,target);
        System.out.println(ans);
    }

    //returns index of the smallest character in an array that is larger than target
    static int nextGreatestchar(char[] arr, char target){
        int start = 0;
        int end = arr.length -1;

        while(start < end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid -1;
            } else{
                start = mid +1;
            }
        }
        return arr[start] % arr.length ;

    }
}
