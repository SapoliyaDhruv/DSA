import java.util.Scanner;

public class P22 {
    public static void swap(int arr[],int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
    }
    public static void reverce(int f, int arr[], int n) {
        if (f >= n/2) {
            return;
        } else {
            swap(arr,f, n - f - 1);
            reverce(f+1, arr, n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the array lenght:-");
        n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        reverce(0, arr, n);

        
        for (int i = 0; i < n; i++) {
            System.out.println("***Reverce***");
            System.out.println(arr[i]);
        }
    }
}
