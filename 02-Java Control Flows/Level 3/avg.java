import java.lang.*;
import java.util.*;
class l2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of students");
        n = sc.nextInt();
        String[] remarks=new String[n];
        double[] percentage=new double[n];
        double[] m=new double[n];
        double[] p=new double[n];
        double[] c=new double[n];
        for(int i=0;i<n;i++)
        {
            if(n<0)
            {
                System.out.println("Enter positive number");
                i--;
            }
            else
                System.out.println("Maths marks");
            double maths=sc.nextInt();
            System.out.println("physics");
            double physics=sc.nextInt();
            System.out.println("Chemistry");
            double chemistry=sc.nextInt();
            m[i]=maths;
            p[i]=physics;
            c[i]=chemistry;
            double average=(maths+physics+chemistry)/3;
            if(average>=80)
            {
                percentage[i]=average;
                remarks[i]="Level 4, above agency-normalized standards";
            }
            else if(average>=70&&average<=79)
            {
                percentage[i]=average;
                remarks[i]="Level 3, at agency mormalized";
            }
            else if(average>=60&&average<=69)
            {
                percentage[i]=average;
                remarks[i]="level 2, below, but approaching agency-normalized standards";
            }
            else if(average>=50&&average<=59)
            {
                percentage[i]=average;
                remarks[i]="Level 1,well below agency-normalized standards";
            }
            else if(average>=40&&average<=69)
            {
                percentage[i]=average;
                remarks[i]="Level 1,too below agency-normalized standards";
            }
            else System.out.println("Remedial standards");

        }
        for(int i=0;i<n;i++)
        {
            System.out.print("Maths marks: " + m[i] + " ");
            System.out.print("Physics marks: " + p[i] + " ");
            System.out.print("Chemistry marks: " + c[i] + " ");
            System.out.print("Percentage: " + percentage[i] + " ");
            System.out.println("Remarks: " + remarks[i]);
        }

    }
}