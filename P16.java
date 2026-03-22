import java.util.Scanner;

public class P16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Eneter the the Number:-");
        number = sc.nextInt();
        int count = 0;
        
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Number is Prime");
        } else {
            System.out.println("Number is Not Prime");
            
    }}
}
