import java.lang.*;
import java.util.*;
class Level2 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double a, b, c;
System.out.println("Enter the numbers");
a=sc.nextDouble();
b=sc.nextDouble();
c=sc.nextDouble();
double n1=a+b*c, n2=a*b+c, n3=c+a/b, n4=a % b + c;
System.out.println("The result of double operations are " + n1 + " " + n2 + " " + n3 + " " + n4);
}
}