/*
 *********
 *******
  *****
   ***
    *
 */

public class P8 {
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            for (int space = 0; space < i; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j <2*5-(2*i+1); j++) {
                System.out.print("*");
            }
            for (int space = 0; space < i; space++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
