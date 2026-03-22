import java.util.Scanner;

public class P19 {

    public static void number(int count, int num) {
        if (count == num+1) {
            return;
        } else {
            number(count + 1, num);
            System.out.println(count);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Enter the number:- ");
        num = sc.nextInt();

        number(1, num);

    }
}
