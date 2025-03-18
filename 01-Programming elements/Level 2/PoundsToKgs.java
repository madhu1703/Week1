import java.lang.*;
import java.util.*;

class Level2 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double pound;
System.out.println("Weight in pounds");
pound=sc.nextDouble();
double kg=0;
kg=pound/2.2;
System.out.println("The weight of the person in pound is " + pound + " and in kg is " + kg);
}
}