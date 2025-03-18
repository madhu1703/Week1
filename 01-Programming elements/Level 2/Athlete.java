import java.lang.*;
import java.util.*;
class Level2 {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
int a, b, c;
System.out.println("Enter the sides");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
int p=a+b+c;
double km=0;
km=1000*p;
double dist=5000;
double tot=dist/p;
System.out.println("The total number of rounds the athlete will run is " + tot + " to finish 5km");
}
}