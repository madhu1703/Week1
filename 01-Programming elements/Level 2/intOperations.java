import java.lang.*;
import java.util.*;
class Level2 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a, b, c;
System.out.println("Enter the numbers");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
int n1=a+b*c, n2=a*b+c, n3=c+a/b, n4=a % b + c;
System.out.println("The result of int operations are " + n1 + " " + n2 + " " + n3 + " " + n4);
}
}