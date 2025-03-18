import java.lang.*;
import java.util.*;
class Level2 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
float salary, bonus;
System.out.println("Enter the salary and bonus");
salary=sc.nextFloat();
bonus=sc.nextFloat();
float total=salary+bonus;
System.out.println("The salary is INR " + salary + " and the bonus is INR " + bonus + " and the total income
is INR " + total);
}
}