import java.lang.*;
import java.util.*;
class Level2 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
float df,dt;
float tf,tt;
System.out.println("Enter the distance from start point via mid point and destinaton point and the time
taken respectively");
df=sc.nextFloat();
dt=sc.nextFloat();
tf=sc.nextFloat();
tt=sc.nextFloat();
float Dist=df+dt;
float time=tf+tt;
System.out.println("The distance from start to destination is " + Dist + " and the time (in mins) from start
to end is " + time);
}
}