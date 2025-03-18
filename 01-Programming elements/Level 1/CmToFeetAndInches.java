import java.lang.*;
import java.util.*;
class FirstAssessment {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double cm;
System.out.println("Enter your height in cm");
cm=sc.nextInt();
double i=cm/2.54;
double f=i/12;
System.out.println("Your Height in cm is " + cm +" while in feet is " + f + " and inches is " + i);
}
}