import java.util.Scanner;

public class P23 {

    public static boolean pel(int i,String string) {

        if (i >= string.length()) {
            return true;
        }
        
        if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
            return false;
        }
        return pel(i + 1, string);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string;

        System.out.println("Enter the String:-");
        string = sc.next();

        System.out.println(pel(0,string));
    }
}
