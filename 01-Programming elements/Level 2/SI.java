import java.lang.*;
import java.util.*;
class Level2 {
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
double p,r,t;
System.out.println("Enter the principle, rate and time");
p=sc.nextDouble();
r=sc.nextDouble();
t=sc.nextDouble();
double SI=(p*r*t)/100;
System.out.println("The simple interest is " + SI + " for principle is " + p + "rate of interest is " + r + " and
time is " + t);
}
}