import java.lang.*;
import java.util.*;
class FirstAssessment {
public static void main(String[] args) {
int r=6378;
double v=(4.0/3.0) * Math.PI * Math.pow(r,3);
double c=Math.pow(0.621371, 3);
double M=c*v;
System.out.println("The volume of earth in cubic kilometers is " + v + " km3" + " and cubic miles is " +
M + "miles3");

}
}