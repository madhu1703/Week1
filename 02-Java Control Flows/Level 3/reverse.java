import java.lang.*;
import java.util.*;
class reverseArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int revNum=0;
        int temp = n;
        int count = 0;

        while (temp > 0) {
            count++;
            temp /= 10;
        }
        int[] reversedNumber = new int[count];
        int index=0;
        while(n>0)
        {
            int digit=n%10;
            reversedNumber[index] = digit;
            index++;
            n=n/10;
        }
        System.out.println("The reversed number is ");
        for(int i=0;i<count;i++)
        {
            System.out.print(reversedNumber[i]);
        }
    }
}