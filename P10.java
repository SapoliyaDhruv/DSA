public class P10 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i < 2*n-1; i++) {
            if (i>n) {
                i = 2*n - i;
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}
