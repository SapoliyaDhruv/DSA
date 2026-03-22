import java.util.Scanner;

public class P24 {

    public static int fibo(int pos) {
        
        if (pos <= 1) {
            return pos;
        }
        return fibo(pos - 1) + fibo(pos - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pos;
        System.out.println("Enter the position if fibonachi:-");
        pos = sc.nextInt();

        System.out.println(fibo(pos));
    }
}
