import java.lang.*;
import java.util.*;
class Level2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number");
        n = sc.nextInt();
        if (n >= 1) {
            int b=n*(n+1)/2;
            System.out.println("Given number is a natural number and the sum of " + n + "sum of numbers is " + b);
        }
        else {
            System.out.println("It  is not a natural number");
        }


    }
}