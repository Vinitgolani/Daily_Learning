// 34. Find First and Last Position of Element in Sorted Array
import java.util.Arrays;
public class Thirtyfour{
    public static void main(String[] args) {
        int[] arr = {7,7,8,8,8,10};
        int target = 8;
        Thirtyfour obj = new Thirtyfour();
        System.out.println(Arrays.toString(obj.searchRange(arr,target)));

    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans ={-1,-1};
        int start = Search(nums,target,true);
        int end = Search(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    //Function to return the index value of the target
    public int Search(int[] nums, int target,boolean FirstTargetIndex){
        int start = 0;
        int end = nums.length -1;
        int ans = -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if(FirstTargetIndex == true){
                    end = mid-1;
                } else{
                  start = mid+1;
                }
            }
        }
        return ans;
    }

}