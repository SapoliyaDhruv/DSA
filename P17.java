import java.util.Scanner;

public class P17 {

    public static void num(int number,int count) {
        if (number < count) {
           return;
        } else {
            System.out.println(count);
            num(number,count+1);
            
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.println("Enter the number till you want to print:-");
        number = sc.nextInt();

        num(number,1);
        sc.close();
    }
}
