import java.util.Scanner;

public class P14 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        number = sc.nextInt();
        int number_2 = number;
        int sum = 0;
        int lastdigit = 0;
        while (number > 0) {
            lastdigit = number % 10;
            number = number / 10;

            sum = sum + (lastdigit * lastdigit * lastdigit);
        }

        if (number_2 == sum) {
            System.out.println("Number is Armstrong");
        }else {
            System.out.println("Number is Not Armstrong");
        }
    }
}
