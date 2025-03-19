import java.lang.*;
import java.util.*;
class l1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a number");
        n=sc.nextInt();
        int[] multiplicationTable=new int[10];
        for(int i=1;i<=10;i++)
        {
            multiplicationTable[i-1]=n*i;
            System.out.println(n + " * " + i + " = " + multiplicationTable[i - 1]);
        }
    }
}