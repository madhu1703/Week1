import java.lang.*;
import java.util.*;
class Level2 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a,b;
System.out.println("Enter the numbers");
a=sc.nextInt();
b=sc.nextInt();
System.out.println("Enter 1 to swap or 2 to reverse the swap:");
int swap=sc.nextInt();
switch (swap) {
case 1:
int temp=a;
a=b;
b=temp;
case 2:
break;
}
System.out.println("The swapped numbers are " + a + b);
}
}