import java.lang.*;
import java.util.*;
class FirstAssessment {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int b,h;
System.out.println("Enter base and height");
b=sc.nextInt();
h=sc.nextInt();
int a=(b*h)/2;
double i=6.45*a;
double n=h/2.54;
double f=n/12;
System.out.println("Area of a triangle in centimeter square is " + a + " and in inches " + i);
System.out.println("height in cm is " + h + " in inches is " + n + " in feet is " + f);
}
}