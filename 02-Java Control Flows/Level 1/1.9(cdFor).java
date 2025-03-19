import java.lang.*;
import java.util.*;
class springSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the count down");
        n = sc.nextInt();
        for(int i=n;i>0;i--)
        {
            System.out.println(i);
        }
    }
}