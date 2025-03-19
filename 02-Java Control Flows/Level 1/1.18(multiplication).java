import  java.lang.*;
import java.util.*;
class L2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number");
        n=sc.nextInt();
        int p=1;
        for(int i=6;i<=9;i++)
        {
            p=n*i;
            System.out.println(i + "x" + n + "=" + p + " ");
        }

    }
}