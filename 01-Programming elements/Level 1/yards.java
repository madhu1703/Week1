import java.lang.*;
import java.util.*;
class FirstAssessment {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double f;
System.out.println("Enter the distance in feet:");
f = sc.nextDouble();
double y = f / 3;
double m = y / 1760;
System.out.println("Distance in feet is " + f + ", while in yards is " + y + ", and in miles is " + m);
}
}