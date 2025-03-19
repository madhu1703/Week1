import  java.lang.*;
import java.util.*;
class L2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double s;
        int y;
        System.out.println("Enter the salary and year of service");
        s=sc.nextDouble();
        y=sc.nextInt();
        double t=1;
        double percentage=5;
        if(y>5)
        {
            t=s*(percentage/100);
        }
        else
            t=0;
        System.out.println("The bonus amount is " + t);
    }