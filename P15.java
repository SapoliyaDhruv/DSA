import java.util.Scanner;

public class P15 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:- ");
        number = sc.nextInt();

        int divistor=1;

        while (divistor != number+1) {
            if (number % divistor == 0) {
                System.out.println(divistor);
            }
            divistor++;
        }
    }
}
