import java.lang.*;
import java.util.*;
class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number");
        n = sc.nextInt();

        int r;
        int sum=0;
        int on=n;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            sum=sum+r*r*r;
        }
        if(sum==on)
        {
            System.out.println("It is an anrmstrong number");
        }
        else System.out.println("It is not an armstrong number");

    }
}