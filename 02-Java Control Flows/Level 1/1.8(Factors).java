import java.lang.*;
import java.util.*;
class l1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int[] arr = new int[10];
        int p = 0;
        System.out.println("Enter a number");
        n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                arr[p] = i;
                p++;
            }
        }
        System.out.print("Factors of " + n + " are: ");
        for (int i = 0; i < p; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}