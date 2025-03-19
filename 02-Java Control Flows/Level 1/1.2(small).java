import java.lang.*;
import java.util.*;
class Level2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        System.out.println("Number 1, Number 2, Number 3");
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        if(n1<n2&&n1<n3)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}