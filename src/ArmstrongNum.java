
//Question : Armstrong NUmber in java
import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check for armstrong : ");
        int n = sc.nextInt();
        System.out.println();
        System.out.println(isArmstrong(n));
    }

    static boolean isArmstrong(int n){
        int sum = 0;
        int temp = n;
        if(n < 99)
            return false;
        while(temp >0){
            int LastDig = temp % 10;
            sum += (LastDig * LastDig * LastDig);
            temp = temp/10;
        }
        if(sum == n)
            return true;

        return false;
    }

}

