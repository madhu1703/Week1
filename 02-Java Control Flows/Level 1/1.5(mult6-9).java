import java.lang.*;
import java.util.*;
class l1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        int p=0;
        System.out.println("Enter a number");
        n=sc.nextInt();
        int[] multiplicationTable=new int[10];
        for(int i=6;i<=9;i++)
        {
            multiplicationTable[p]=n*i;
            System.out.println(n + " * " + i + " = " + multiplicationTable[p]);
        }
    }
}