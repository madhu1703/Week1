import java.lang.*;
import java.util.*;
class Level2
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n1,n2;
System.out.println("Enter the numbers");
n1=sc.nextInt();
n2=sc.nextInt();
float q=n1/n2;
float r=n1%n2;
System.out.println("The quotient is " + q + " and the remainder is " + r + " for the numbers " + n1 + " and " +
n2);
}
}