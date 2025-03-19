import java.lang.*;
import java.util.*;
class l3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w;
        int h;
        System.out.println("Enter the weight and height");
        w=sc.nextDouble();
        h=sc.nextInt();
        double m=h/100.0;
        double bmi=w/(m*m);
        System.out.println("BMI: " + bmi);
        if(bmi<=18.4)
        {
            System.out.println("Under weight");
        }
        else if(bmi>=18.5&&bmi<=24.9)
        {
            System.out.println("Normal");
        }
        else if(bmi>=25&&bmi<=39.9)
        {
            System.out.println("Over weight");
        }
        else System.out.println("Obese");

    }
}