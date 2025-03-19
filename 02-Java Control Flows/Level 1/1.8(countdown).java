import java.lang.*;
import java.util.*;
class cd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the count down");
        n=sc.nextInt();
        while(n>0)
        {
            System.out.println(n);
            n--;
        }
    }
}