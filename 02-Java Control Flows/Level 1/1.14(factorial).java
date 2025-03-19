import java.lang.*;
import java.util.*;
class Level2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number");
        n = sc.nextInt();
        int s=1;
        int i=1;
        while(i<=n)
        {
            s*=i;
            i++;
        }
        System.out.println(s);
    }
}