import java.lang.*;
import java.util.*;
class L1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double n;
        double s=0;
        while(true){
            System.out.println("Enter the number");
            n=sc.nextDouble();
            if(n<=0&&n==0)
            {
                break;
            }
            s+=n;
            System.out.println(s);
        }

    }