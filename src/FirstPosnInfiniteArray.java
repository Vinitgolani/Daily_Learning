public class FirstPosnInfiniteArray {
    public static void main(String[] args) {
        int[] nums = {2,3,5,6,8,10,11,12,15,20,22,23,30,31};
        int target = 15;
        System.out.println(findRange(nums,target));
    }
    static int findRange(int[] nums, int target) {
        //first find the range (s,e)
        //Starting ith the box of 2
        int start = 0;
        int end = 1;
        while (nums[end] < target) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return BinarySearch(nums,target,start,end);
    }
    static int BinarySearch(int[] nums, int target, int start, int end){
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
