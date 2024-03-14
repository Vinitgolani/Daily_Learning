public class Changenums {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        changenum(a,b);
        System.out.println(a+" " + " " +b);
    }

    static void changenum(int a, int b) {
        int temp = a;
        a = b;
        b= temp;
    }
}
