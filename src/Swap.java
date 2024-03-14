import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        //swap(arr, 0, 3);
        //System.out.println(max(arr));
        //System.out.println(maxRange(arr, 0,3));
        reverse(arr);
        System.out.println(Arrays.toString(arr));

        //System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static int maxRange(int[] arr, int start, int end){
        int maxval = arr[0];
        for(int i = start; i < end+1 ; i++){
            if(arr[i] > maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static int max(int[] arr){
        int maxval = arr[0];
        for(int i=1; i< arr.length; i++){
            if(arr[i] > maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }
}
