import java.lang.*;
import java.util.*;
class FirstAssessment {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

double f;
double d;
System.out.println("Enter the fees amount and discount percentage");
f=sc.nextDouble();
d=sc.nextDouble();
double da = f*(d/100);
double dp = f-da;
System.out.println("The discount amount is INR " + da + " and final discounted fee is INR " + dp);
}
}