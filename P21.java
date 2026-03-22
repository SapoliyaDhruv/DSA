import java.util.Scanner;

public class P21 {

    public static void fact(int fact, int num) {
        if (num == 0) {
            System.out.println("Fact is :- " + fact);
            return;
        } else {
            fact = fact * num;
            fact(fact, num-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.println("Enter the number:-");
        num = sc.nextInt();

        fact(1, num);
    }
}

