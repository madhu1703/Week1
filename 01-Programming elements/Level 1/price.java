import java.lang.*;
import java.util.*;
class FirstAssessment
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
float up;
int qty;
System.out.println("Enter the unit price and quantity");
up=sc.nextFloat();
qty=sc.nextInt();
float tot=up*qty;
System.out.println("The total purchase price is " + tot + " while the unit price is " + up + " and the quantity is
" + qty);
}
}