//Finding Ceiling of a number (smallest element in the array which is greater than or equal to the target)
public class CeilingofNum {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println("Ceiling number of "+target+" is "+(ceiling(arr,target)));
    }

    //Returns the value of smallest number greater or equal to target
    static int ceiling(int[] arr, int target){
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
        return arr[start];
    }
}
