import java.lang.*;
import java.util.*;
class L2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number");
        n = sc.nextInt();
        int i=100;
        while(i>1)
        {
            if(n%i==0)
            {
                System.out.println(i);
            }
            i--;

        }
    }
}