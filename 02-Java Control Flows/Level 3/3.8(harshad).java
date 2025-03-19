import java.lang.*;
import java.util.*;
class l3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a number");
        n=sc.nextInt();
        int on=n;
        int r;
        int sum=0;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            sum=sum+r;
        }
        if(on%sum==0)
        {
            System.out.println("It is an harshad number");
        }
        else System.out.println("It is not an harshad number");
    }
}