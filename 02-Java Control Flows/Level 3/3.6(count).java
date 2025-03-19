import java.lang.*;
import java.util.*;
class l3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number");
        n = sc.nextInt();

        int r;

        int count=0;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            count++;

        }

        System.out.println(count);


    }
}