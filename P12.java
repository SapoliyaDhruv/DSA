import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        number = sc.nextInt();

        int lastdigit = 0;
        int reverce = 0;
        while (number > 0) {
            lastdigit = number % 10;
            number = number / 10;

            reverce = (reverce * 10) + lastdigit;
        }

        System.out.println(reverce);
    }
}
