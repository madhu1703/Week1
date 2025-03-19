import java.lang.*;
import java.util.*;
class l1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][3];
        int[] b=new int[9];
        int p=0;
        System.out.print("Enter the array rows and columns");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                b[p]=arr[i][j];
                p++;
            }
        }
        System.out.println("Enter the one dimensional array");
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i] + " ");
        }
    }
}