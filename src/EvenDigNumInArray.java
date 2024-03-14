public class EvenDigNumInArray {
    public static void main(String[] args) {
        int[] arr = {12, 365, 6, 7, 7480};
        System.out.println(FindNums(arr));
    }

    static int FindNums(int[] arr){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(Even(arr[i])){
                count++;
            }
        }
        return count;
    }

    static int Dig(int num){
        int count = 0;
        while(num > 0) {
            count++;
            num = num/10;
        }
        return count;
    }

    static boolean Even(int num){
        int numberofdigs = Dig(num);
        if(numberofdigs % 2 == 0){
            return true;
        }
        return false;
    }
}
