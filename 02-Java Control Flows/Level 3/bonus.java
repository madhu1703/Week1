import java.lang.*;
import java.util.*;
class employeeBonus
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        double[][] old=new double[n][2];
        double[][] newBonus=new double[n][2];
        double bonus=0;
        double totalBonus=0;
        double totalOldsalary=0;
        double totalNewsalary=0;
        for(int i=0;i<n;i++) {
            System.out.println("Enter the salary and years of experience of " +(i + 1));
            double salary=sc.nextDouble();
            double yoe=sc.nextDouble();
            old[i][0]=salary;
            old[i][1]=yoe;
            if(salary<=0 || yoe<0)
            {
                System.out.println("Invalid");
                i--;
            }
            else if(yoe>5)
            {
                bonus=0.05*salary;
            }
            else if(yoe<=5)
            {
                bonus=0.02*salary;
            }
            newBonus[i][0]=bonus;
            newBonus[i][1]=bonus+salary;
            totalBonus+=bonus;
            totalOldsalary+=salary;
            totalNewsalary+=newBonus[i][1];
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("New salary of employee "+(i+1));
            System.out.println(newBonus[i][1]);
        }
        System.out.println("Total bonus is "+totalBonus+" total old salary is "+totalOldsalary+" total new salary is "+totalNewsalary);
    }
}