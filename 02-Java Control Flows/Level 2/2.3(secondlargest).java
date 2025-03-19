import java.lang.*;
import java.util.*;
class l2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int maxDigit=10;
        int[] A=new int[maxDigit];
        System.out.println("Enter the numbers");
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }
            int max1, max2;
        max1=max2=A[0];

            for(int i=0;i<A.length;i++)
            {
                if(A[i]>max1)
                {
                    max2=max1;
                    max1=A[i];
                }
                else if(A[i]>max2&&A[i]!=max1)
                {
                    max2=A[i];
                }
            }
            System.out.println("Second largest element is "+max2);

    }
}