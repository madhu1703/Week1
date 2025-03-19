import java.lang.*;
import java.util.*;
class l3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number");
        n = sc.nextInt();
        int on=n;
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        if(sum>on)
        {
            System.out.println("Its is an abundant number");
			}
        else System.out.println("It is not an abundant number");
    }
}