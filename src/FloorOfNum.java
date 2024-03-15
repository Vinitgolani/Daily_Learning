//Finding Floor of a number (greatest element in the array which is smaller than or equal to the target)
public class FloorOfNum {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println("Floor number of "+target+" is "+(floor(arr,target)));
    }

    //Returns the value of greatest number smaller or equal to target
    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while(start <= end ){
            int mid = start + (end - start)/2;

            if(target > arr[mid]){
                start = mid+1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                return arr[mid];
            }
        }
        return arr[end];
    }
}
