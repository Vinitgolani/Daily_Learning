public class Eightfiftytwo {
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

    public static void main(String[] args) {
        int[] arr = {2,3,5,6,9,10,8,7,4};
        Eightfiftytwo obj = new Eightfiftytwo();
        System.out.println(obj.peakIndexInMountainArray(arr));
    }
}
