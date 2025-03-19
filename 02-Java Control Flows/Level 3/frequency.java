import java.lang.*;
import java.util.*;
class findFrequency
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        long n=sc.nextLong();
        int[] frequency=new int[10];
        while(n>0)
        {
            int digit=(int)n%10;
            frequency[digit]++;
            n=n/10;
        }
        for(int i=0;i<frequency.length;i++)
        {
            System.out.println("The frequency of "+i+" = "+frequency[i]);
        }
    }
}