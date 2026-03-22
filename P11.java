//Count digit and numner

import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:-");
        number = sc.nextInt();

        // System.out.println(number);
        int digit = 0;
        int n_digit;
        while (number > 0) {
            n_digit = number % 10;
            number = number / 10;
            System.out.println(n_digit);
            digit++;
        }
        System.out.println("Total Digit:- "+digit);
    }
}
