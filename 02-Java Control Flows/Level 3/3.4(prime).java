import java.lang.*;
import java.util.*;
class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number");
        n = sc.nextInt();
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                break;
            } else
                System.out.println("isPrime");
            break;

        }
    }
}