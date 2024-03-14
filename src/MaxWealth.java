import java.util.Scanner;
public class MaxWealth {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number rows you want in the matrix : ");
        int n = sc.nextInt();
        int[][] arr = new int[n][];
        for (int i=0; i < n; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Therefore the final Matix Looks like : ");
        for (int i=0; i < arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Therefore the Wealth of the richest person is :");
        System.out.print(MaxRowSum(arr));*/

        int[][] arr = {
                {1,2,3},
                {3,2,1}
        };

        System.out.println(MaxRowSum(arr));
    }

    static int MaxRowSum(int[][] arr){
        int max=0;
        int rowsum = 0;
        for(int row=0; row<arr.length; row++){
            rowsum = 0;
            for(int col=0; col<arr[row].length; col++){
                rowsum += arr[row][col];
            }
        }
        if(max<rowsum){
            max = rowsum;
        }
        return max;
    }
}
