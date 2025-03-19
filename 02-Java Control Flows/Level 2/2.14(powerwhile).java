import java.lang.*;
import java.util.*;
class L2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,p;
        System.out.println("Enter the number and power");
        n = sc.nextInt();
        p=sc.nextInt();
        int r=1;
        int i=1;
        while(i<=p)
        {
            r*=n;
            i++;
        }
        System.out.println(r);
    }
}