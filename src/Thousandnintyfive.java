public class Thousandnintyfive {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        Thousandnintyfive obj = new Thousandnintyfive();
        System.out.println(obj.findInMountainArray(target,arr));
    }
    public int findInMountainArray(int target, int[]arr) {
        int peak = peakIndexInMountainArray(arr);
        int firsTry = BinarySearch(arr,target,0,peak);
        if(firsTry!=-1){
            return firsTry;
        }else{
            return BinarySearch(arr,target,peak+1,arr.length-1);
        }
    }
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while( start<end){
            int mid = start + (end-start)/2;
            if(arr[mid] >arr[mid+1]){
                end = mid;
            }else {
                start = mid+1;
            }
        }
        return start;
    }
     int BinarySearch(int[] arr, int target, int start, int end){
        boolean isAsc = arr[start] < arr[end];
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if(isAsc){
                if (target < arr[mid]) {
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }else{
                if (target > arr[mid]) {
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
