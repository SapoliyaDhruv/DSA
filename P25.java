
//HASH array

import java.util.Arrays;
import java.util.Scanner;

public class P25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("ENter the number of element you want ot insert:-");
        n = sc.nextInt();

        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        

        int[] hash = new int[13];
        Arrays.fill(hash, 0);
        
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        int check;
        System.out.println("ENter the number of elemtes frequncy you want to check:-");
        check = sc.nextInt();

        for (int i = 0; i < check; i++) {
            int number;
            System.out.println("Enter number:- ");
            number = sc.nextInt();

            System.out.println("Number "+number+" is "+hash[number] +" Time");
        }
    }
}
