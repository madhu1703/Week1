import java.lang.*;
import java.util.*;
class Expression
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       int m,p,c;
        System.out.println("Enter the marks of maths,physics,chemistry");
        m=sc.nextInt();
        p=sc.nextInt();
        c=sc.nextInt();
        int average=(m+p+c)/3;
        if(average>=80)
        {
            System.out.println("Level 4, above agency-normalized standards");
        }
        else if(average>=70&&average<=79)
        {
            System.out.println("Level 3, at agency mormalized");
        }
        else if(average>=60&&average<=69)
        {
            System.out.println("level 2, below, but approaching agency-normalized standards");
        }
        else if(average>=50&&average<=59)
        {
            System.out.println("Level 1,well below agency-normalized standards");
        }
        else if(average>=40&&average<=69)
        {
            System.out.println("Level 1,too below agency-normalized standards");
        }
        else System.out.println("Remedial standards");

    }
}