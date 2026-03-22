// Print name N time

import java.util.Scanner;

public class P18 {

    public static void name(int count, int num) {
        if (count == num+1) {
            return;
        } else {
            System.out.println("Dhruv");
            name(count+1, num);
        }
    }
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number that tyme you want to print Name:- ");
        num = sc.nextInt();

        name(1, num);
    }
}
