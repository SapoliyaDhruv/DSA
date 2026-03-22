//HASHING TECHNIQUE for lowercase character frequency count

import java.util.Arrays;
import java.util.Scanner;

public class P26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = new String();
        
        System.out.println("Enter the string:-");
        str = sc.next();

        int[] hash = new int[26];
        Arrays.fill(hash,0);

        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i) - 'a'] += 1;
        }
        
        int check;
        System.out.println("Enter the number of cheracter for you wanto to check the frequcy:-");
        check = sc.nextInt();

        for (int i = 0; i < check; i++) {
            char ch;
            System.out.println("Enter the character-");
            ch = sc.next().charAt(0);

            System.out.println("Character "+ch+" is "+hash[ch-'a']+" Time ");
        }
    }
}
