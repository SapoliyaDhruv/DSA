// Sum of first n number

import java.util.Scanner;

public class P20 {
    public static void sum(int sum,int num) {
        if (num == 0) {
            System.out.println("Sum is :- "+sum);
            return;
        } else {
            sum = sum + num;
            sum(sum,num - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Enter the number:- ");
        num = sc.nextInt();

        sum(0,num);
    }

}
