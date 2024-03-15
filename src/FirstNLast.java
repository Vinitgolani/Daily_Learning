import java.util.Arrays;
public class FirstNLast{
    public static void main(String[] args) {
        int[] arr = {5,7,7,7,7,8,8,10};
        int target = 7;
        System.out.print("First and Last index of Target element in array are ");
        System.out.println(Arrays.toString(searchrange(arr,target)));
    }

    static int[] searchrange(int[] arr, int target){
        int[] ans = {-1, -1};
        // check for first occurrence if target first
        ans[0] = search(arr, target, true);
        if (ans[0] != -1) {
            ans[1] = search(arr, target, false);
        }
        return ans;
    }

    static int search(int[] arr, int target, boolean FirstTargetIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;
                if (FirstTargetIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}

