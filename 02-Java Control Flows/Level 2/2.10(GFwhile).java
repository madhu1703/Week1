import java.lang.*;
import java.util.*;
class L2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number");
        n=sc.nextInt();
        int i=n-1;
        while(i>0)
        {
            if(n%i==0)
            {
                System.out.println(i);
                break;
            }
            i--;
        }
    }
}