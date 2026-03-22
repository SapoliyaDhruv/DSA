import java.util.Scanner;

public class P13 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:-");
        number = sc.nextInt();
        int number_2 = number;
        int lastdigit=0;
        int reverce=0;
        while (number > 0) {
            lastdigit = number % 10;
            number = number / 10;
            reverce = (reverce * 10) + lastdigit;
        }

        if (number_2 == reverce) {
            System.out.println("Number is pelidrom");
        } else {
            System.out.println("Number is Not pelidrom");
            
        }
    }
}
