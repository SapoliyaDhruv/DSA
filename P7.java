/*

    *    
   ***
  *****
 *******
*********
 
*/

public class P7 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int space = 0; space <= 5 - i - 1; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            for (int space = 0; space <= 5 - i - 1; space++) {
                System.out.print(" ");
            }
        System.out.println();

        }
    }
}
